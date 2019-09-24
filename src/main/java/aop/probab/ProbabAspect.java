package aop.probab;


import analysis.Analysis;
import impl.constants.Constants;
import impl.types.alkInt.AlkInt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.math.BigDecimal;
import java.math.BigInteger;

@Aspect
public class ProbabAspect {

    @Before("execution(* impl.visitors.helpers.NonDeterministic.getRandom(..))")
    public void setProbabilisticAlgorithmToProbab(JoinPoint joinPoint)
    {
        if (Analysis.algorithm_type.equals("determinist"))
            Analysis.algorithm_type = "probabilist";
    }

    @Before("execution(* impl.visitors.helpers.NonDeterministic.choose(..)) || " +
            "execution(* impl.visitors.helpers.NonDeterministic.chooseST(..)) ")
    public void setProbabilisticAlgorithmToChose(JoinPoint joinPoint)
    {
        Analysis.algorithm_type = "nedeterminist";
    }

    @After("execution(* impl.visitors.helpers.NonDeterministic.getRandom(..))")
    public void modifyProbabilityRandom(JoinPoint joinPoint)
    {
        BigInteger possiblePaths = ((AlkInt) joinPoint.getArgs()[0]).value;
        Analysis.probability = Analysis.probability.multiply(BigDecimal.ONE.divide(new BigDecimal(possiblePaths), Constants.MAX_DECIMALS, BigDecimal.ROUND_HALF_UP));
        Analysis.probability = Analysis.probability.setScale(Constants.MAX_DECIMALS, BigDecimal.ROUND_HALF_UP);

    }

}