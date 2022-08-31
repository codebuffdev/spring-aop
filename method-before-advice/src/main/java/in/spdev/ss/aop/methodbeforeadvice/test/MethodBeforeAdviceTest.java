package in.spdev.ss.aop.methodbeforeadvice.test;

import in.spdev.ss.aop.methodbeforeadvice.advice.AuditAdvice;
import in.spdev.ss.aop.methodbeforeadvice.beans.LoanApprover;
import org.springframework.aop.framework.ProxyFactory;

public class MethodBeforeAdviceTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new LoanApprover());
        proxyFactory.addAdvice(new AuditAdvice());
        LoanApprover loanApprover = (LoanApprover) proxyFactory.getProxy();
        loanApprover.approveLoan(1022l);
    }
}
