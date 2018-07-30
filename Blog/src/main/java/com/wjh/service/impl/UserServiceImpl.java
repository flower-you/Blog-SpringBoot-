package com.wjh.service.impl;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.wjh.dao.TUserMapper;
import com.wjh.service.IUserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
import xaut.wjh.entity.TUser;
@Service
@Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
public class UserServiceImpl implements IUserService {
	@Autowired
	private TUserMapper usermapper;
	
	@Override
	public boolean login(TUser user) {
		Assert.notNull(user,"参数错误！");
		Example example=new Example(TUser.class);
		example.createCriteria().andEqualTo("username", user.getUsername());
		example.createCriteria().andEqualTo("password",user.getPassword());
		List<TUser> ulist=usermapper.selectByExample(example);
		if(ulist!=null&&ulist.size()>0) {
			TUser temp = ulist.get(0);
			BeanUtils.copyProperties(temp, user);
			return true;
		}
		return false;
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	@Override
	public int regist(TUser user) {
		return usermapper.insert(user);
	}
	
	/**
	 * 判断用户名是否已经存在
	 * @param user
	 * @return true表示用户名已经存在
	 */
	public boolean ExistUser(TUser user) {
		Example example=new Example(TUser.class);
		Criteria c=example.createCriteria();
		TUser temp=new TUser();
		temp.setUsername(user.getUsername());
		c.andEqualTo(temp);
		List<TUser> ulist=usermapper.selectByExample(example);
		if(ulist.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
