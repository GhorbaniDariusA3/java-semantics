package execution.state.expression;

import execution.ExecutionResult;
import execution.state.ExecutionState;
import grammar.alkParser;
import parser.env.LocationMapper;
import parser.exceptions.AlkException;
import execution.types.alkBool.AlkBool;
import parser.visitors.expression.ExpressionVisitor;
import util.CtxState;
import util.Payload;
import util.SplitMapper;
import util.types.Value;

import static parser.exceptions.AlkException.ERR_CONDITIONAL_NO_BOOL;

@CtxState(ctxClass = alkParser.ConditionalExpressionContext.class)
public class ConditionalExpressionState extends ExecutionState {

    private alkParser.ConditionalExpressionContext ctx;
    private Value queryExpression;
    private boolean checkedQuery = false;

    public ConditionalExpressionState(alkParser.ConditionalExpressionContext tree, Payload payload) {
        super(tree, payload);
        ctx = tree;
    }

    @Override
    public ExecutionState makeStep()
    {
        if (result != null)
        {
            return null;
        }

        if (queryExpression == null && !checkedQuery)
        {
            return request(ExpressionVisitor.class, ctx.logical_or_expression());
        }

        if (ctx.expression().size() == 0)
        {
            result = new ExecutionResult<>(queryExpression);
            return null;
        }

        queryExpression = queryExpression.toRValue();
        if (!(queryExpression instanceof AlkBool))
        {
            super.handle(new AlkException(ERR_CONDITIONAL_NO_BOOL));
        }

        if (((AlkBool) queryExpression).isTrue())
        {
            return request(ExpressionVisitor.class, ctx.expression(0));
        }
        else
        {
            return request(ExpressionVisitor.class, ctx.expression(1));
        }
    }

    @Override
    public void assign(ExecutionResult result)
    {
        if (queryExpression == null)
        {
            checkedQuery = true;
            queryExpression = result.getValue();
        }
        else
        {
            this.result = new ExecutionResult(result.getValue().toRValue());
        }
    }

    @Override
    public ExecutionState clone(SplitMapper sm) {
        ConditionalExpressionState copy = new ConditionalExpressionState(ctx, sm.getPayload());
        if (queryExpression != null)
        {
            copy.queryExpression = queryExpression.weakClone(sm.getLocationMapper());
        }
        return super.decorate(copy, sm);
    }
}