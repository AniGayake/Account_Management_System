package com.barclays.accountmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//Table for User Details 
@Entity
@Table(name = "Users")
public class Users {
	@Id
	@NotNull
	public long customerId;
	public String password;
	// public int roleId;

	public Users() {

	}

	public Users(@NotNull long customerId, String password, int roleId) {
		super();
		this.customerId = customerId;
		this.password = password;
		// this.roleId = roleId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
//	public int getRoleId() {
//		return roleId;
//	}
//	public void setRoleId(int roleId) {
//		this.roleId = roleId;
//	}
//	

}
