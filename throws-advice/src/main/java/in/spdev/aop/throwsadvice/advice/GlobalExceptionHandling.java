package in.spdev.aop.throwsadvice.advice;

import org.springframework.aop.ThrowsAdvice;

public class GlobalExceptionHandling implements ThrowsAdvice {
    public void afterThrowing(RuntimeException ex){
        System.out.println("GlobalExceptionHandling");
        System.out.println(ex.getCause());
        System.out.println(ex.getMessage());
    }
    //public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
}
