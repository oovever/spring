package com.spring.test.bean;


import com.spring.test.service.House;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements SmartFactoryBean {

	@Override
	public Object getObject() throws Exception {
		return new House();
	}

	@Override
	public Class<?> getObjectType() {
		return House.class;
	}
}
