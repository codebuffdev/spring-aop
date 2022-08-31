package in.spdev.aop.timetracker.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Aspect
public class TimeTrackingAspect {

    @Around("@annotation(TrackExecutionTime)")
    public List<Map<String, Object>> trackTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        List<Map<String, Object>>  returnValue = (List<Map<String, Object>>) proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("TIME TAKEN IS " + (endTime-startTime));
        return returnValue;
    }
}
