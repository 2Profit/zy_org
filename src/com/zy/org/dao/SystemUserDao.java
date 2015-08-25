package com.zy.org.dao;

import com.zy.common.entity.PageModel;
import com.zy.org.entity.User;

public interface SystemUserDao {
	
	PageModel<User> queryForPage(int currentPage,int pageSize);
	
}
