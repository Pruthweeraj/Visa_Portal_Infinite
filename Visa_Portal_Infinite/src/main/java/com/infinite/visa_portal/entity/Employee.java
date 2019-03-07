package com.infinite.visa_portal.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@Column(nullable = false)
	private Long employeeId;

	private String employeeName;

	@Column(nullable = false)
	private String employeeMailId;

	private LocalDate employeeDoj;

	private Float employeePreviousExprience;

	private Long employeeMobileNumber;
	
	private String projectManager;
	
	@ManyToOne
	@JoinColumn( name = "project_id")
	private Project project;

	public Employee() {}
	

	public Employee(Long employeeId, String employeeName, String employeeMailId, LocalDate employeeDoj,
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

	
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
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

	public LocalDate getEmployeeDoj() {
		return employeeDoj;
	}

	public void setEmployeeDoj(LocalDate employeeDoj) {
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
