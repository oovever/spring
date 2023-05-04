package com.spring.test;

import com.spring.test.service.House;
import com.spring.test.service.User;
import com.spring.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
//		 1. 扫描配置路径范围内的所有类 创建非懒加载的单例bean
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.registerShutdownHook();
		User user = context.getBean(User.class);
		user.test();
		House house = (House) context.getBean("testFactoryBean");
		System.out.println(context.getBean("&testFactoryBean"));
		System.out.println("111 " + context.getBean("userService"));
		System.out.println(house);
		UserService userService = (UserService) context.getBean("userService");
		userService.test();
	}
}
