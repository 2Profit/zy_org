package com.zy.org.dao;

import java.util.List;

import com.zy.org.entity.User;

public interface UserRoleRelCustomDao {

	/**
	 * 根据角色ID和用户名查找用户
	 * @param roleId
	 * @param name
	 * @return
	 */
	List<User> findUserListByRoleCondition(String roleId,String name);
	
	void deleteRoleByUserId(String userId);
}
