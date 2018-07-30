package com.wjh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wjh.dao.TBlogKindMapper;
import com.wjh.service.IBlogKindService;

import xaut.wjh.entity.TBlogKind;
@Controller
public class BlogKindServiceImpl implements IBlogKindService{
	@Autowired
	private TBlogKindMapper kindMapper;
	
	@Override
	public List<TBlogKind> findAllKind() {
		List<TBlogKind> kindList=kindMapper.selectAll();
		return kindList;
	}
	
}
