package in.spdev.aop.anno.aroundadvice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("in.spdev.aop.anno.aroundadvice")
@EnableAspectJAutoProxy
public class JavaConfig {
    
}
