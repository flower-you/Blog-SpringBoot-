package com.wjh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wjh.dao.TBlogMapper;
import com.wjh.service.IBlogService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
import xaut.wjh.entity.TBlog;
import xaut.wjh.entity.TUser;
@Service
@Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
public class BlogSeviceImpl implements IBlogService {
	@Autowired
	private TBlogMapper blogmapper;
	
	@Override
	public List<TBlog> findBlogList(int uid) {
		Example example=new Example(TBlog.class);
		Criteria c=example.createCriteria();
		TBlog temp=new TBlog();
		temp.setUid(uid);
		c.andEqualTo(temp);
		List<TBlog> blogList=blogmapper.selectByExample(example);
		return blogList;
	}

}
