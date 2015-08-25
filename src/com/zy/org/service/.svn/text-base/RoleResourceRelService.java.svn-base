package com.zy.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.org.dao.RoleResourceRelDao;
import com.zy.org.entity.Resource;
import com.zy.org.entity.RoleResourceRel;

@Service
public class RoleResourceRelService extends CommonService<RoleResourceRel,String>{

	@Autowired
	private RoleResourceRelDao roleResourceRelDao;

	@Autowired
	public void setRoleResourceRelDao(RoleResourceRelDao roleResourceRelDao) {
		super.setCommonDao(roleResourceRelDao);
	}
	
	/**
	 * 根据角色ID找资源
	 * @param roleId
	 * @return
	 */
	public List<Resource> findResourceListByRole(String roleId){
		List<Resource> resourceList = roleResourceRelDao.findResourceListByRole(roleId);
		return resourceList;
	}
	
	public List<Resource> findResourceListByResource(String resourceId){
		List<Resource> resourceList = roleResourceRelDao.findResourceListByResource(resourceId);
		return resourceList;
	}
}
