package in.spdev.aop.aspectj.around.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class LoggingAspect {
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
        Object returnVal = null;

        System.out.println(methodName);
        Arrays.stream(args).forEach(System.out::println);
//        returnVal = proceedingJoinPoint.proceed();

        //modifying args
        args[0] = 101;
        args[1] = 102;
        returnVal = proceedingJoinPoint.proceed(args);
        return returnVal;
    }
}
