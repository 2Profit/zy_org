package com.zy.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.common.dao.CommonDao;
import com.zy.org.entity.User;

public interface UserDao extends SystemUserDao,CommonDao<User,String>{

	@Query("select u from User u where u.username=?1 ")
	List<User> findUserByName(String userName);
	
}
