package com.zy.org.dao;

import com.zy.common.dao.CustomBaseSqlDaoImpl;
import com.zy.common.entity.PageModel;
import com.zy.org.entity.User;

public class UserDaoImpl extends CustomBaseSqlDaoImpl implements SystemUserDao{
	
	public PageModel<User> queryForPage(int currentPage,int pageSize){
		String hql="select u from User u where u.deleteFlag = 0 or u.deleteFlag is null ";
		return this.queryForPage(hql, currentPage, pageSize);
	}
	
}
