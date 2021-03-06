package symbolic;

import ast.AST;
import execution.parser.env.Location;
import execution.parser.env.LocationMapper;
import util.lambda.LocationGenerator;
import util.types.Storable;

public class SymbolicValue
implements SymbolicValueIface
{
    AST ast;

    public SymbolicValue(AST ast) {
        this.ast = ast;
    }

    @Override
    public Storable weakClone(LocationMapper locationMapper) {
        return null;
    }

    @Override
    public Storable clone(LocationGenerator generator) {
        return null;
    }

    @Override
    public Storable toRValue() {
        return null;
    }

    @Override
    public Location toLValue() {
        return null;
    }

    public AST getAst()
    {
        return ast;
    }

    @Override
    public String toString()
    {
        return ast.toString();
    }
}
