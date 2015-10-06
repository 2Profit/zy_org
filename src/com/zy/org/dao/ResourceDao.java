package com.zy.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.common.dao.CommonDao;
import com.zy.org.entity.Resource;

public interface ResourceDao extends CommonDao<Resource,String>{

	@Query("select r from Resource r where r.deleteFlag = 0 and r.parent=null order by r.orderNo")
	List<Resource> getRootResourceList();
	
	@Query("select r from Resource r where r.deleteFlag = 0 order by r.orderNo")
	List<Resource> getSystemResourceList();
}
