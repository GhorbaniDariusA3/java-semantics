package impl.exceptions;

import static impl.constants.Constants.DEBUG;

public class InterpretorException extends Exception {
    public final static String ERR_VALUE_TYPE_UNRECOGNIZED = "The type of the operand is unrecognized.";
    public final static String ERR_HAS = "The data structure does not have has implemented.";
    public final static String ERR_PARAMS_UNDECLARED = "The function does not have the number of parameters declared in constants.";

    public InterpretorException(String text)
    {
        super(text);
    }

    public void printException(int line) {
        if (!DEBUG) return;
        printStackTrace();
    }
}
