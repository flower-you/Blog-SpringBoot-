package com.wjh.service;

import xaut.wjh.entity.TUser;

public interface IUserService {
	public boolean login(TUser user);
	public int regist(TUser user);
	public boolean ExistUser(TUser user);
}
