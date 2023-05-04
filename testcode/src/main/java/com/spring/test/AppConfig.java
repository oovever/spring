package com.spring.test;

import com.spring.test.service.User;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.spring.test")
@EnableScheduling
@EnableAspectJAutoProxy
public class AppConfig {

//	@Bean
//	DataSource dataSource() {
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setUrl(environment.getProperty("url"));
//		driverManagerDataSource.setUsername(environment.getProperty("db_user"));
//		driverManagerDataSource.setPassword(environment.getProperty("db_pwd"));
//		driverManagerDataSource.setDriverClassName(environment.getProperty("mysql_driver"));
//		return driverManagerDataSource;
//	}

	@Bean
	public User user() {
		return new User();
	}

}

