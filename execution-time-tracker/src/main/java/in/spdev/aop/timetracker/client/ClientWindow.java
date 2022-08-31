package in.spdev.aop.timetracker.client;

import in.spdev.aop.timetracker.config.ETTApplicationConfig;
import in.spdev.aop.timetracker.model.Account;
import in.spdev.aop.timetracker.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class ClientWindow {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ETTApplicationConfig.class);
        AccountService serviceBean = applicationContext.getBean(AccountService.class);
        List<Map<String, Object>> allEmployee = serviceBean.getAllEmployee();
        allEmployee.stream().forEach(System.out::println);
    }
}
