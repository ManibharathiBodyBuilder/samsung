package com.samsung.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
@Data
@Entity
@Table(name="EmpDetails")
public class ModelLayer
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column
	private Long EmpId;
	@Column
	private String EmpName;
	@Column
	private String EmpEmail;
	@Column
	private String EmpPhone;
	@Column
	private Long EmpSalary;
	@Column
	private String EmpPlace;
	@Column
	private String EmpWork;
	@Column
	private String EmpDepartment;
	
	public String getEmpDepartment() {
		return EmpDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		EmpDepartment = empDepartment;
	}
	
	
	/*@OneToOne(cascade = CascadeType.ALL)
	private EmployeeModelLayer employeeModelLayer;
	
	
	public ModelLayer(EmployeeModelLayer employeeModelLayer) {
		super();
		this.employeeModelLayer = employeeModelLayer;
	}
	

*/	public ModelLayer(Long empId, String empName, String empEmail, String empPhone, Long empSalary, String empPlace,
			String empWork) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpEmail = empEmail;
		EmpPhone = empPhone;
		EmpSalary = empSalary;
		EmpPlace = empPlace;
		EmpWork = empWork;
	}
	
	public ModelLayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmpId() {
		return EmpId;
	}
	public void setEmpId(Long empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	public String getEmpPhone() {
		return EmpPhone;
	}
	public void setEmpPhone(String empPhone) {
		EmpPhone = empPhone;
	}
	public Long getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(Long empSalary) {
		EmpSalary = empSalary;
	}
	public String getEmpPlace() {
		return EmpPlace;
	}
	
	public void setEmpPlace(String empPlace) {
		EmpPlace = empPlace;
	}
	public String getEmpWork() {
		return EmpWork;
	}
	public void setEmpWork(String empWork) {
		EmpWork = empWork;
	}
	}