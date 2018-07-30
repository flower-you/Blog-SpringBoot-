package com.wjh.service;

import java.util.List;

import xaut.wjh.entity.TBlog;
import xaut.wjh.entity.TUser;

public interface IBlogService {
	public List<TBlog> findBlogList(int uid);
}
 