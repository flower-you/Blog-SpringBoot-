package com.wjh.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wjh.service.IUserService;

import xaut.wjh.entity.TUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private IUserService userv;
	@Test
	public void contextLoads() {
	}
//	@Test
//	public void regist() {
//		TUser user=new TUser();
//		user.setUsername("嘻嘻");
//		user.setPassword("xixi");
//		userv.regist(user);
//	}
	@Test
	public void login() {
		TUser user=new TUser();
		user.setUsername("呵呵");
		user.setPassword("hehe");
		System.out.println(userv.login(user));
	}
	@Test
	public void checkName() {
		TUser user=new TUser();
		user.setUsername("豆豆");
		System.out.println(userv.ExistUser(user));
	}

}
