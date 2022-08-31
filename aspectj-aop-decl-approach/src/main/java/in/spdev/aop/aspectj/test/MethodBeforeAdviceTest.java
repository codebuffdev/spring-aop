package in.spdev.aop.aspectj.test;

import in.spdev.aop.aspectj.methodbeforeadvice.beans.LoanApply;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodBeforeAdviceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        LoanApply loanApply = applicationContext.getBean("loan", LoanApply.class);
        String applyLoanStatus = loanApply.applyLoan(2000);
        System.out.println(applyLoanStatus);
    }
}
