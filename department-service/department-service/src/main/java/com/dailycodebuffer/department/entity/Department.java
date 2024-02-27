package com.dailycodebuffer.department.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name="department_tbl")
@Access(value=AccessType.FIELD)
@SequenceGenerator(name="department_tbl_seq" , sequenceName="department_tbl_seq", allocationSize=1)
//@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Department {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="department_tbl_seq")
	@Column(name = "id")
	private Long id;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	

	
}
