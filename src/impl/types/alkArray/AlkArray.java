package impl.types.alkArray;

import impl.exceptions.AlkException;
import impl.exceptions.InterpretorException;
import impl.types.AlkIterableValue;
import impl.types.AlkValue;
import impl.types.alkBool.AlkBool;
import impl.types.alkInt.AlkInt;
import impl.types.alkStructure.AlkStructure;

import java.util.ArrayList;
import java.util.Iterator;

import static impl.constants.Constants.MAX_ARRAY;
import static impl.exceptions.AlkException.*;

public class AlkArray extends AlkIterableValue {

    private ArrayList<AlkValue> array;

    public AlkArray() {
        type = "Array";
        isDataStructure = true;
        isIterable = true;
        array = new ArrayList<>();;
    }

    public void push(AlkValue value)
    {
        array.add(value);
    }

    @Override
    public AlkValue equal(AlkValue operand) throws AlkException, InterpretorException {
        if (!operand.type.equals("Array"))
            throw new AlkException(ERR_EQUAL_ARR);
        AlkArray op = (AlkArray) operand;
        return new AlkBool(array.toString().equals(op.toString()));
    }

    @Override
    public AlkBool lower(AlkValue operand) throws AlkException {
        if (!operand.type.equals("Array"))
            throw new AlkException(ERR_LOWER_ARR);
        AlkArray op = (AlkArray) operand;
        return new AlkBool(array.toString().compareTo(op.toString())<0);
    }

    public AlkValue get(int index) throws AlkException {
        if (index<0 || index>=MAX_ARRAY)
            throw new AlkException(ERR_ARRAY_OUT_OF_BOUNDS);
        while (array.size()<=index)
            array.add(new AlkInt(0));
        return array.get(index);
    }

    @Override
    public AlkValue size()
    {
        return new AlkInt(array.size());
    }

    public void put(int index, AlkValue value) throws AlkException {
        if (index<0 || index>=MAX_ARRAY)
            throw new AlkException(ERR_ARRAY_OUT_OF_BOUNDS);
        while (array.size()<=index)
            array.add(new AlkInt(0));
        array.set(index, value);
    }

    public boolean has(AlkValue operator)
    {
        for (AlkValue alkValue : array) {
            try {
                if (((AlkBool) alkValue.equal(operator)).value)
                    return true;
            } catch (AlkException | InterpretorException ignored) {}
        }
        return false;
    }

    @Override
    public AlkValue bracket(int operand) throws AlkException {
        return get(operand);
    }

    @Override
    public AlkValue clone() {
        AlkArray copy = new AlkArray();
        copy.array = (ArrayList<AlkValue>) array.clone();
        return copy;
    }

    @Override
    public String toString() {
        return array.toString();
    }

    @Override
    public Iterator<AlkValue> iterator() {
        return array.iterator();
    }
}