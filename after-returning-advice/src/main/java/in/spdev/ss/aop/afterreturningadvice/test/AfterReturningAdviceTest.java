package in.spdev.ss.aop.afterreturningadvice.test;

import in.spdev.ss.aop.afterreturningadvice.advice.NumberCheckAfterAdvice;
import in.spdev.ss.aop.afterreturningadvice.beans.RandomNumberGenerator;
import org.springframework.aop.framework.ProxyFactory;

public class AfterReturningAdviceTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new RandomNumberGenerator());
        proxyFactory.addAdvice(new NumberCheckAfterAdvice());
        RandomNumberGenerator randomNumberGeneratorProxy = (RandomNumberGenerator) proxyFactory.getProxy();
        int randomNumber = randomNumberGeneratorProxy.generateRandomNumber();
        System.out.println(randomNumber);
    }
}
