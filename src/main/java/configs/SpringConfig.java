package configs;

import dao.UserDao;
import dao.UserDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import service.UserService;
import service.UserServiceImp;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
//@ComponentScan (basePackages = {"service","dao"})

public class SpringConfig {

    @Autowired
    private Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource () {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sweetoctober?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public UserDao userDao() {
        return new UserDaoImp();
    }

    @Bean
     public UserService userService() {
        return new UserServiceImp();
    }
}
