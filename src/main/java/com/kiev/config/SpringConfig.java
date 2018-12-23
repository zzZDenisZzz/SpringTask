package com.kiev.config;

import com.kiev.dao.UserDao;
import com.kiev.dao.UserDaoImpl;
import com.kiev.service.UserService;
import com.kiev.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/task?useSSL=false&serverTimezone=UTC");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return driverManagerDataSource;
    }

    @Bean
    public UserDao getUserDao() {
        return new UserDaoImpl(getJdbcTemplate());
    }

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}