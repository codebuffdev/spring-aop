package in.spdev.ss.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class LoggingAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String methodName = null;
        Object[] args = null;
        Object targetClass = null;

        methodName = invocation.getMethod().getName();
        args = invocation.getArguments();
        targetClass = invocation.getClass();
        Arrays.stream(args).forEach(System.out::println);

        //modifying args
        for (int i = 0 ; i<args.length;i++){
            args[i] = 100+i;
        }

        Integer returnValue = (Integer) invocation.proceed();
        System.out.println("add methods return original value " + returnValue);

        return returnValue+100;
    }
}
