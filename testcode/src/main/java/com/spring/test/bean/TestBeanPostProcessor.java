package com.spring.test.bean;

import com.spring.test.service.User;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Created this one by oovever on 2023/4/27.
 */
public class TestBeanPostProcessor implements InstantiationAwareBeanPostProcessor, MergedBeanDefinitionPostProcessor {

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		User user = new User();
		beanDefinition.getPropertyValues().add("user", user);
	}
}
