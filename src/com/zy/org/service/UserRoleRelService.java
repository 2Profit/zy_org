package com.zy.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.org.dao.UserRoleRelDao;
import com.zy.org.entity.Role;
import com.zy.org.entity.User;
import com.zy.org.entity.UserRoleRel;

@Service
public class UserRoleRelService extends CommonService<UserRoleRel,String>{

	@Autowired
	private UserRoleRelDao userRoleRelDao;

	@Autowired
	public void setUserRoleRelDao(UserRoleRelDao userRoleRelDao) {
		super.setCommonDao(userRoleRelDao);
	}
	
	/**
	 * 取某个用户的角色列表
	 * @param userId
	 * @return
	 */
	public List<Role> getRoleListByUser(String userId){
		return userRoleRelDao.getRoleListByUser(userId);
	}
	
	/**
	 * 取某个角色下的用户列表
	 * @param roleId
	 * @return
	 */
	public List<User> getUserListByRole(String roleId){
		return this.userRoleRelDao.getUserListByRole(roleId);
	}
	
	/**
	 * 根据角色ID和用户名查找用户
	 * @param roleId
	 * @param name
	 * @return
	 */
	public List<User> findUserListByRoleCondition(String roleId,String name){
		return this.userRoleRelDao.findUserListByRoleCondition(roleId, name);
	}
	
	public void deleteRoleByUserId(String userId) {
		userRoleRelDao.deleteRoleByUserId(userId);
	}
}
