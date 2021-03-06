package execution.types.alkBool;

import execution.parser.env.LocationMapper;
import execution.parser.exceptions.AlkException;
import execution.types.AlkComparable;
import execution.types.AlkValue;
import util.lambda.LocationGenerator;

import static execution.parser.exceptions.AlkException.ERR_EQUAL_BOOL;
import static execution.parser.exceptions.AlkException.ERR_LOWER_BOOL;

/**
 * The main and only class responsible for the boolean values.
 * Overrides specific operations like logicalOr, logicalAnd and not.
 */
public class AlkBool extends AlkValue implements AlkComparable<AlkBool>
{

    /** the main storage which backs the AlkBool type*/
    private Boolean value;

    /**
     * Basic constructor which wraps a boolean value
     * @param value
     * The boolean value used to initialize the storage
     */
    public AlkBool(boolean value)
    {
        type = "Bool";
        this.value = value;
    }


    /**
     * Basic getter for the value
     * @return
     * The value of the boolean
     */
    public boolean getValue()
    {
        return value;
    }

    @Override
    public AlkValue ifelse(AlkValue expr1, AlkValue expr2)
    {
        return isTrue() ? expr1 : expr2;
    }

    /**
     * Basic overload of the AlkValue default logicalOr operation
     * @param operand
     * The right operand of the binary operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public AlkBool logicalor(AlkValue operand)
    {
        if (!(operand instanceof AlkBool))
        {
            throw new AlkException("Invalid operands for logical or operation");
        }
        return new AlkBool(value || ((AlkBool) operand).value);
    }


    @Override
    public AlkValue bitwisexor(AlkValue operand)
    {
        if (operand instanceof AlkBool)
            return new AlkBool(value ^ ((AlkBool) operand).value);
        return super.bitwisexor(operand);
    }


    /**
     * Basic overload of the AlkValue default logicalAnd operation
     * @param operand
     * The right operand of the binary operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public AlkBool logicaland(AlkValue operand)
    {
        if (!(operand instanceof AlkBool))
        {
            throw new AlkException("Invalid operands for logical and operation");
        }
        return new AlkBool(value && ((AlkBool) operand).value);
    }


    /**
     * Basic override of the AlkValue default not operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public AlkBool not()
    {
        return new AlkBool(!value);
    }

    @Override
    public AlkValue weakClone(LocationMapper locMapping) {
        return clone(null);
    }


    /**
     * Basic overload of the AlkValue default equal operation
     * TODO: remove when it won't be abstract in the parent
     * @param operand
     * The right operand of the binary operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    @Deprecated
    public AlkBool equal(AlkValue operand)
    {
        if (!(operand instanceof AlkBool))
            throw new AlkException(ERR_EQUAL_BOOL);
        return new AlkBool(value == ((AlkBool)operand).value);
    }


    /**
     * Basic overload of the AlkValue default lower operation
     * TODO: remove when it won't be abstract in the parent
     * @param operand
     * The right operand of the binary operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    @Deprecated
    public AlkBool lower(AlkValue operand)
    {
        if (!(operand instanceof AlkBool))
            throw new AlkException(ERR_LOWER_BOOL);
        return new AlkBool(!value);
    }


    /**
     * Basic override of the AlkComparable equal method
     * @param operand
     * The right operand of the binary operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public AlkBool equal(AlkBool operand)
    {
        return new AlkBool(value == operand.value);
    }


    /**
     * Basic override of the AlkComparable lower method
     * @param operand
     * The right operand of the binary operation
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public AlkBool lower(AlkBool operand)
    {
        return new AlkBool(!value);
    }


    /**
     * Basic override of the clone method, imposed by the abstract parent
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public AlkValue clone(LocationGenerator generator)
    {
        return new AlkBool(value);
    }


    /**
     * Basic override of the toString method, imposed by the abstract parent
     * @return
     * An AlkBool representing the result of the expression
     */
    @Override
    public String toString()
    {
        if (value)
            return "true";
        return "false";
    }

    public boolean isTrue() {
        return value;
    }
}
