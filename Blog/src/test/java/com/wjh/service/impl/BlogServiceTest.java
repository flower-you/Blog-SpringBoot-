package com.wjh.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wjh.service.IBlogService;

import xaut.wjh.entity.TBlog;
import xaut.wjh.entity.TUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceTest {
	@Autowired
	private IBlogService bs;
	
	@Test
	public void contextLoads() {
		
	}
	@Test
	public void findBlogList() {
		
		List<TBlog> blogList=bs.findBlogList(24);
		for(TBlog blog:blogList) {
			System.out.println(blog.getId()+"标题："+blog.getTitle());
		}
	}

}
