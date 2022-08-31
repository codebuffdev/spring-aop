package in.spdev.aop.timetracker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:db.properties")
@ComponentScan("in.spdev.aop.timetracker")
public class ETTApplicationConfig {

    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource(
                Objects.requireNonNull(environment.getProperty("db.url")),
                Objects.requireNonNull(environment.getProperty("db.username")),
                Objects.requireNonNull(environment.getProperty("db.password")));

    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
