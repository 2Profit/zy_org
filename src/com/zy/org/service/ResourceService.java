package com.zy.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.common.service.CommonService;
import com.zy.org.dao.ResourceDao;
import com.zy.org.entity.Resource;

@Service
public class ResourceService extends CommonService<Resource,String>{

	@Autowired
	private ResourceDao resourceDao;

	@Autowired
	public void setResourceDao(ResourceDao resourceDao) {
		super.setCommonDao(resourceDao);
	}
	
	public List<Resource> getRootResourceList(){
		return resourceDao.getRootResourceList();
	}
	/**
	 * 根据类型取所有资源
	 * @param type
	 * @return
	 */
	public List<Resource> getSystemResourceList(){
		return this.resourceDao.getSystemResourceList();
	}
}
