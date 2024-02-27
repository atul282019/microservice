package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department deaprtment) {
		
		//log.info("Inside department service");
		return departmentRepository.save(deaprtment);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findDepartmentById(departmentId);
	
	}

	public Department findDataById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findDepartmentById(departmentId);
	}

}
