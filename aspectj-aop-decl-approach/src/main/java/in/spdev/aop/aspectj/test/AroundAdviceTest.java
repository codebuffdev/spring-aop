package in.spdev.aop.aspectj.test;

import in.spdev.aop.aspectj.around.beans.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AroundAdviceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Calculator calculator = applicationContext.getBean("cal",Calculator.class);
        System.out.println("class type is "+calculator.getClass().getCanonicalName());
        int sum = calculator.add(10,20);
        System.out.println("sum is " + sum);
    }
}
