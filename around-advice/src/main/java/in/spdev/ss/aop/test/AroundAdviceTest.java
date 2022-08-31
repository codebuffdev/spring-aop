package in.spdev.ss.aop.test;

import in.spdev.ss.aop.advice.LoggingAdvice;
import in.spdev.ss.aop.beans.Calculator;
import org.springframework.aop.framework.ProxyFactory;

public class AroundAdviceTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Calculator());
        proxyFactory.addAdvice(new LoggingAdvice());
        Calculator calculatorProxy = (Calculator) proxyFactory.getProxy();
        int add = calculatorProxy.add(10, 20);
        System.out.println(add);
    }
}
