package com.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class School {

	private String name;
	private String city;

	@Autowired(required = false)
	public School(House house) {

	}

	@Autowired(required = false)
	public School(House house1, House house2) {

	}





	public School(@Value("北大")
	String name, @Value("北京")
	String city) {
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return name + "_" + city;
	}
}
