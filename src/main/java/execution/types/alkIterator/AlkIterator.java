package execution.types.alkIterator;

import execution.parser.env.LocationMapper;
import execution.parser.exceptions.AlkException;
import execution.types.AlkValue;
import execution.types.alkBool.AlkBool;
import execution.types.alkInt.AlkInt;
import execution.types.alkList.AlkList;
import util.lambda.LocationGenerator;

import java.util.ListIterator;

import static execution.parser.exceptions.AlkException.*;

public class AlkIterator extends AlkValue
{

    public ListIterator value;
    public AlkList father;

    public AlkIterator(ListIterator value, AlkList father)
    {
        type = "Iterator";
        this.value = value;
        this.father = father;
    }

    @Override
    public AlkBool equal(AlkValue operand)
    {
        if (!(operand.type.equals("Iterator")))
            throw new AlkException(ERR_NOTEQUAL_ITERATOR);
        AlkIterator it = (AlkIterator) operand;
        if (it.value.nextIndex() == value.nextIndex())
            return new AlkBool(true);
        return new AlkBool(false);
    }

    @Override
    public AlkBool lower(AlkValue operand) throws AlkException {
        if (!(operand.type.equals("Iterator")))
            throw new AlkException(ERR_LOWER_ITERATOR);
        AlkIterator op = (AlkIterator) operand;
        return new AlkBool(value.nextIndex()<op.value.nextIndex());
    }

    @Override public AlkValue add(AlkValue operand) throws AlkException {
        if (!(operand.type.equals("Int")))
            throw new AlkException(ERR_ADD_ITERATOR);
        AlkInt times = (AlkInt) operand;
        AlkIterator it = this.clone(null);
        try{
            for (int i=0; i<times.value.intValueExact(); i++)
            {
                if (!it.value.hasNext())
                    throw new AlkException(ERR_ITERATOR_NO_NEXT);
                it.value.next();
            }
        }catch (ArithmeticException e)
        {
            throw new AlkException(ERR_ADD_ITERATOR_TOOBIG);
        }
        return it;
    }

    @Override public AlkValue subtract(AlkValue operand) throws AlkException {
        if (!(operand.type.equals("Int")))
            throw new AlkException(ERR_SUBTRACT_ITERATOR);
        AlkInt times = (AlkInt) operand;
        AlkIterator it = this.clone(null);
        try{
            for (int i=0; i<times.value.intValueExact(); i++)
            {
                if (!it.value.hasPrevious())
                    throw new AlkException(ERR_ITERATOR_NO_PREVIOUS);
                it.value.previous();
            }
        }catch (ArithmeticException e)
        {
            throw new AlkException(ERR_SUBTRACT_ITERATOR_TOOBIG);
        }
        return it;
    }

    @Override public AlkValue delete() throws AlkException {
        value.next();
        value.remove();
        return this;
    }

    @Override
    public AlkValue weakClone(LocationMapper locMapping) {
        return clone(null);
    }

    @Override public AlkValue plusplusleft() throws AlkException {
        if (!value.hasNext())
            throw new AlkException(ERR_ITERATOR_NO_NEXT);
        value.next();
        return this;
    }

    @Override public AlkValue minusminusleft() throws AlkException {
        if (!value.hasPrevious())
            throw new AlkException(ERR_ITERATOR_NO_PREVIOUS);
        value.previous();
        return this;
    }

    @Override public AlkValue minusminusmod() throws AlkException {
        if (!value.hasPrevious())
            value = father.end().value;
        value.previous();
        return this;
    }

    @Override public AlkValue plusplusmod() throws AlkException {
        if (!value.hasNext())
            throw new AlkException(ERR_ITERATOR_IS_END);
        value.next();
        if (!value.hasNext())
            value = (ListIterator) father.iterator();
        return this;
    }

    @Override public AlkValue star() throws AlkException
    {
        if (!value.hasNext())
            throw new AlkException(ERR_ITERATOR_INVALID);
        AlkValue returnable = (AlkValue) value.next();
        value.previous();
        return returnable;
    }

    @Override
    public AlkIterator clone(LocationGenerator generator) {
        ListIterator it = (ListIterator) father.iterator();
        while (it.nextIndex() != value.nextIndex())
            it.next();
        return new AlkIterator(it, father);
    }

    @Override
    public String toString() {
        return "iterator"; // TODO prctic nu se poate scrie un iterator
    }
}
