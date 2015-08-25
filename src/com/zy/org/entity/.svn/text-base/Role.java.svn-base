package com.zy.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;

/**
 * 角色管理
 * @author Jianfang Xu
 *
 */
@Entity
@Table(name = "org_role")
public class Role extends BaseEntity{

	private static final long serialVersionUID = 8160747791143322423L;
	
	public final static Integer STATUS_YES = 1; //可用
	
	public final static Integer STATUS_NO = 0; //不可�?	
	public final static String ROLE_SELLER_ADMIN = "2c9081294dc9741c014dc9760f710001"; //�?��人员管理角色
	
	public final static String ROLE_SELLER_COMMON = "2c9081294dc9741c014dc97660cb0008"; //�?��人员
	
	private String name;
	
	private String description;
	
	private Integer status;

	@Column(length = 100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	@Column(length = 500)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
