package com.zy.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.common.dao.CommonDao;
import com.zy.org.entity.Role;
import com.zy.org.entity.User;
import com.zy.org.entity.UserRoleRel;

public interface UserRoleRelDao  extends UserRoleRelCustomDao,CommonDao<UserRoleRel,String>{

	 @Query("select r.role from UserRoleRel r where r.user.id = ?1 ")
	 List<Role> getRoleListByUser(String userId);
	 
	 @Query("select r.user from UserRoleRel r where r.role.id = ?1 ")
	 List<User> getUserListByRole(String roleId);
	 
}
