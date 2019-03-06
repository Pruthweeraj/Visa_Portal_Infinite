package com.infinite.visa_portal.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@Column(nullable = false)
	private String employeeId;

	private String employeeName;

	@Column(nullable = false)
	private String employeeMailId;

	private Timestamp employeeDoj;

	private Float employeePreviousExprience;

	private Long employeeMobileNumber;
	
	private String projectManager;
	
	@ManyToOne
	@JoinColumn( name = "project_id")
	private Project project;

	public Employee() {}
	

	public Employee(String employeeId, String employeeName, String employeeMailId, Timestamp employeeDoj,
			Float employeePreviousExprience, Long employeeMobileNumber , String projectManager ,Project project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMailId = employeeMailId;
		this.employeeDoj = employeeDoj;
		this.employeePreviousExprience = employeePreviousExprience;
		this.employeeMobileNumber = employeeMobileNumber;
		this.projectManager = projectManager;
		this.project = project;
	}

	
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMailId() {
		return employeeMailId;
	}

	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}

	public Timestamp getEmployeeDoj() {
		return employeeDoj;
	}

	public void setEmployeeDoj(Timestamp employeeDoj) {
		this.employeeDoj = employeeDoj;
	}

	public Float getEmployeePreviousExprience() {
		return employeePreviousExprience;
	}

	public void setEmployeePreviousExprience(Float employeePreviousExprience) {
		this.employeePreviousExprience = employeePreviousExprience;
	}

	public Long getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}

	public void setEmployeeMobileNumber(Long employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
