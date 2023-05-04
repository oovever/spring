package com.spring.test;

import com.spring.test.service.UserInterface;
import com.spring.test.service.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created this one by oovever on 2022/12/23.
 */
public class ProxyTest {

	public static void main(String[] args) {
		UserService target = new UserService();

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.addAdvice(new MethodInterceptor() {
			@Override
			public Object invoke(MethodInvocation invocation) throws Throwable {
				System.out.println("before...");
				Object result = invocation.proceed();
				System.out.println("after...");
				return result;
			}
		});
		UserInterface userService = (UserInterface) proxyFactory.getProxy();
		userService.test();

	}
}
