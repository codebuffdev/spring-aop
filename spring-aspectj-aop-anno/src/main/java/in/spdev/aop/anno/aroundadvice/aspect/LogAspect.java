package in.spdev.aop.anno.aroundadvice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {
    @Around("execution(* in.spdev.aop.anno.aroundadvice.bean.Cal.add(int,int))")
    public Object log(@NonNull ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(proceedingJoinPoint.getSignature().getName());
        Arrays.asList(proceedingJoinPoint.getArgs()).forEach(System.out::println);
        return proceedingJoinPoint.proceed();
    }
}
