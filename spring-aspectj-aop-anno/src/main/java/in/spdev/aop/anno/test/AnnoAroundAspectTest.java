package in.spdev.aop.anno.test;

import in.spdev.aop.anno.aroundadvice.bean.Cal;
import in.spdev.aop.anno.aroundadvice.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoAroundAspectTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Cal cal = applicationContext.getBean(Cal.class);
        int sum = cal.add(10,30);
        System.out.println(sum);
    }
}
