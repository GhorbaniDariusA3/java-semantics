package ast.expr;

import ast.AST;
import org.antlr.v4.runtime.ParserRuleContext;
import ast.enums.Operator;
import visitor.ifaces.VisitorIface;
import visitor.ifaces.expr.BitwiseOrVisitorIface;

import java.util.List;

public class BitwiseOrAST
extends ExpressionAST
{
    public BitwiseOrAST(ParserRuleContext ctx)
    {
        super(ctx);
    }

    public static BitwiseOrAST createBinary(Operator op, List<AST> children)
    {
        BitwiseOrAST ast = new BitwiseOrAST(null);
        for (AST child : children)
            ast.addChild(child);
        return AST.addOpsASTAttr(ast, op);
    }

    @Override
    public String toString()
    {
        return AST.getBinaryOperationString(this);
    }

    @Override
    public <T> T accept(VisitorIface<T> visitor)
    {
        if (visitor instanceof BitwiseOrVisitorIface)
            return ((BitwiseOrVisitorIface<T>) visitor).visit(this);

        return super.accept(visitor);
    }
}
