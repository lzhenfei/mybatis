package com.tiamaes.demo;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;

import com.tiamaes.demo.mapper.UserMapper;

public class MybatisTest {
	@Resource
	private UserMapper mapper;
	

	@Test
	public  void test() throws IOException {
	}
}
