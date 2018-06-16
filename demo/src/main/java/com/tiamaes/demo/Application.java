package com.tiamaes.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiamaes.demo.mapper.UserMapper;

public class Application {

	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = (UserMapper) application.getBean("userMapper");
		User user = userMapper.selectBlog("lisi");
		System.out.println(user);
	}
}
