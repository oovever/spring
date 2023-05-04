package com.spring.test.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopDemo {

	@Pointcut("execution(* com.spring.test.service.User.*(..))")
	public void pointCut() {
		System.out.println("AopDemo.pointCut " );
	}

	@After("pointCut()")
	public void after() {
		System.out.println("after msg" );
	}


	@Before("pointCut()")
	public void before() {
		System.out.println("before msg" );
	}
}

