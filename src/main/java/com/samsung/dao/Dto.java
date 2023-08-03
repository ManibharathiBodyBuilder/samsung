package com.samsung.dao;

import lombok.Data;

@Data
public class Dto {
	
	private String EmpName;
	private String EmpPhone;
	private String EmpWork;
	private String EmpDepartment;
	private String EmpPlace;
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpPhone() {
		return EmpPhone;
	}
	public void setEmpPhone(String empPhone) {
		EmpPhone = empPhone;
	}
	public String getEmpWork() {
		return EmpWork;
	}
	public void setEmpWork(String empWork) {
		EmpWork = empWork;
	}
	public String getEmpDepartment() {
		return EmpDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		EmpDepartment = empDepartment;
	}
	public String getEmpPlace() {
		return EmpPlace;
	}
	public void setEmpPlace(String empPlace) {
		EmpPlace = empPlace;
	}
	

}
