package com.tiamaes.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiamaes.demo.model.User;
import com.tiamaes.demo.service.UserService;

public class Application {
	

	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) application.getBean("userService");
		User user = userService.findUser("lisi");
		System.out.println(user);
	}
}
