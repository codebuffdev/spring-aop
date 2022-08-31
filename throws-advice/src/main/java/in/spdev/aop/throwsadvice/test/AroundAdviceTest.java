package in.spdev.aop.throwsadvice.test;

import in.spdev.aop.throwsadvice.advice.GlobalExceptionHandling;
import in.spdev.aop.throwsadvice.beans.MakeMyTrip;
import org.springframework.aop.framework.ProxyFactory;

public class AroundAdviceTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new MakeMyTrip());
        proxyFactory.addAdvice(new GlobalExceptionHandling());
        MakeMyTrip makeMyTripProxy = (MakeMyTrip) proxyFactory.getProxy();
        String bookTicketStatus = makeMyTripProxy.bookTicket("ikjbihsdoln");
        System.out.println(bookTicketStatus);
    }
}
