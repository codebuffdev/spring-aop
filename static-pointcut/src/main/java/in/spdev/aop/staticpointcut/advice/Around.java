package in.spdev.aop.staticpointcut.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class Around implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Around Advice");
        System.out.println("Method name " + invocation.getMethod().getName());
        System.out.print("Args");
        Arrays.stream(invocation.getArguments()).forEach(System.out::println);
        Object proceedOriginalReturnValue = invocation.proceed();
        System.out.println("Return value received " + proceedOriginalReturnValue);
        double modifyingRTVal = (double) proceedOriginalReturnValue;
        return modifyingRTVal+10;
    }
}
