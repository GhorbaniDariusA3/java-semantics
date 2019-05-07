package impl.types;

import impl.exceptions.AlkException;
import impl.exceptions.InterpretorException;

import java.util.ArrayList;

import static impl.exceptions.InterpretorException.ERR_HAS;

public abstract class AlkIterableValue extends AlkValue implements Iterable<AlkValue> {

    public abstract boolean has(AlkValue operand);
    public abstract ArrayList toArray();
}