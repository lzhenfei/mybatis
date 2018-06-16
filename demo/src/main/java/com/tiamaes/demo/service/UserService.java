package com.tiamaes.demo.service;

import javax.annotation.Resource;

import com.tiamaes.demo.mapper.UserMapper;
import com.tiamaes.demo.model.User;

public class UserService implements UserServiceInterface {

	@Resource
	private UserMapper userMapper;
	@Override
	public User findUser(String name) {
		User user = userMapper.selectBlog(name);
		return user;
	}

}
