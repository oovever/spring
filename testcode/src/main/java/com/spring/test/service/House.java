package com.spring.test.service;

import javax.jws.soap.SOAPBinding.Use;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {

	private String name;

	@Autowired(required = false)
	public House() {

	}

	@Autowired(required = false)
	public House(User user) {

	}
}
