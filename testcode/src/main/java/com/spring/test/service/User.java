package com.spring.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Component
@EnableTransactionManagement
public class User {

	//	@Autowired
	private House house;

	@Autowired
	private School school;
	@Autowired
	private List<School> schoolList;

	@Value("${123}")
	private String name;
	private String sex;


	public void test() {
		System.out.println(house);
		System.out.println(school);
		System.out.println(school.toString());
		System.out.println(name + "_" + sex);
	}

	@Autowired
	public void setHouse(House house) {
		this.house = house;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Autowired
	public void setName(@Value("帅") String name, @Value("男") String sex) {
		this.name = name;
		this.sex = sex;
	}
}
