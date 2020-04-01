package com.tencent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tencent.service.UserService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPath= new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		 UserService bean = classPath.getBean(UserService.class);
		 bean.test();
	}
 
}
