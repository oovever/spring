package com.spring.test;


import com.spring.test.service.House;
import com.spring.test.service.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIndex {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		context.refresh();
		House house = context.getBean(House.class);
		User user = context.getBean(User.class);
		System.out.println(user);
		System.out.println(house);
	}
}
