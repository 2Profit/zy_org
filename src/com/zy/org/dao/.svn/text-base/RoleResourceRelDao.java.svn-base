package com.zy.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.common.dao.CommonDao;
import com.zy.org.entity.Resource;
import com.zy.org.entity.RoleResourceRel;

public interface RoleResourceRelDao extends CommonDao<RoleResourceRel,String>{

	@Query("select r.resource from RoleResourceRel r where r.role.id = ?1 ")
	List<Resource> findResourceListByRole(String roleId);
	
	@Query("select r.resource from RoleResourceRel r where r.resource.id = ?1 ")
	List<Resource> findResourceListByResource(String resourceId);
	
}
