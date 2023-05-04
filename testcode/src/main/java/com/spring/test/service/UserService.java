package com.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService implements UserInterface {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	@Override
	public void test() {
		System.out.println(111);
	}

	@Override
	@Transactional
	public void test(String value) {
		System.out.println(value);
	}
}
