package util.functions;

import execution.types.AlkValue;
import execution.helpers.Convertors;
import execution.helpers.MathHelper;
import execution.helpers.NonDeterministic;
import execution.types.alkInt.AlkInt;
import execution.types.alkNotAValue.AlkNotAValue;
import execution.types.alkSet.AlkSet;
import io.IOManager;
import execution.parser.env.Location;
import util.Configuration;
import util.lambda.LocationGenerator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static execution.parser.constants.Constants.MAX_DECIMALS;

public class Functions {

    Configuration config;
    LocationGenerator generator;

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue sin(List<AlkValue> params) {
        return MathHelper.sin(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue cos(List<AlkValue> params)
    {
        return MathHelper.cos(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue tan(List<AlkValue> params)
    {
        return MathHelper.tan(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue asin(List<AlkValue> params)
    {
        return MathHelper.asin(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue acos(List<AlkValue> params)
    {
        return MathHelper.acos(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue atan(List<AlkValue> params)
    {
        return MathHelper.atan(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue log(List<AlkValue> params)
    {
        return MathHelper.log(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 2)
    public static AlkValue pow(List<AlkValue> params)
    {
        return MathHelper.pow(ParamHelper.getFloat(params, 0), ParamHelper.getFloat(params, 1));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue sqrt(List<AlkValue> params)
    {
        return MathHelper.sqrt(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 0)
    public static AlkValue pi(List<AlkValue> params)
    {
        return MathHelper.pi();
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue abs(List<AlkValue> params)
    {
        return MathHelper.abs(ParamHelper.getFloat(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue len(List<AlkValue> params)
    {
        return ParamHelper.getValue(params, 0).len();
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue _int(List<AlkValue> params)
    {
        return Convertors.toInt(ParamHelper.getValue(params, 0));
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public static AlkValue _float(List<AlkValue> params)
    {
        return Convertors.toFloat(ParamHelper.getValue(params, 0));
    }

    public Functions(Configuration config, LocationGenerator generator)
    {
        this.config = config;
        this.generator = generator;
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public AlkValue print(List<AlkValue> params)
    {
        IOManager io = config.getIOManager();
        io.write(params.get(0).toString());
        return new AlkNotAValue();
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public AlkValue singletonset(List<AlkValue> params)
    {
        Location loc = generator.generate(ParamHelper.getValue(params, 0));
        return new AlkSet().insert(loc);
    }

    @BuiltInFunctionImpl(paramNumber = 1)
    public AlkValue random(List<AlkValue> params)
    {
        BigDecimal total = new BigDecimal(((AlkInt) ParamHelper.getValue(params, 0)).value);
        config.interpretProbability(BigDecimal.ONE.divide(total, MAX_DECIMALS, RoundingMode.HALF_EVEN));
        config.setProbabilistic(true);
        return NonDeterministic.getRandom(ParamHelper.getValue(params, 0));
    }
}
