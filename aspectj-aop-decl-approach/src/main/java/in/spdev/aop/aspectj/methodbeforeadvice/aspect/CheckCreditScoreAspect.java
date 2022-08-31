package in.spdev.aop.aspectj.methodbeforeadvice.aspect;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class CheckCreditScoreAspect {
    public void checkScore(JoinPoint joinPoint){
        Object [] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName());
        Arrays.stream(args).forEach(System.out::println);
        Integer arg = (Integer) args[0];
        if(arg < 3000)
            throw new IllegalArgumentException("Credit score is too low");
    }
}
