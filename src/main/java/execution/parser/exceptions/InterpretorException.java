package execution.parser.exceptions;

import util.exception.InternalException;

import static execution.parser.constants.Constants.DEBUG;

@Deprecated
public class InterpretorException extends InternalException {
    public final static String ERR_VALUE_TYPE_UNRECOGNIZED = "The type of the operand is unrecognized.";
    public final static String ERR_HAS = "The data structure does not have has implemented.";
    public final static String ERR_PARAMS_UNDECLARED = "The function does not have the number of parameters declared in constants.";
    public final static String ERR_COMPARABLE = "The elements can't be compared.";

    public InterpretorException(String text)
    {
        super(text);
    }

    public void printException(int line) {
        if (!DEBUG) return;
        printStackTrace();
    }
}
