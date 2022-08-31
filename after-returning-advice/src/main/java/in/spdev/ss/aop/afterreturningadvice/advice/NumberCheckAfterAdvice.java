package in.spdev.ss.aop.afterreturningadvice.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class NumberCheckAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        int returnValueOriginal = (int) returnValue;
        System.out.println("returned value " + returnValue);
        System.out.println(method.getName());
        Arrays.stream(args).forEach(System.out::println);
        System.out.println(target.getClass().getName());
        if(returnValueOriginal % 2 != 0){
            throw new RuntimeException("Odd ones not allowed");
        }
    }
}
