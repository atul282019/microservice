package com.dailycodebuffer.controller.dto;

import com.dailycodebuffer.entity.User;


public class ResponseDto {
	
	private User user;
	private DepartmentDto department;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
}
