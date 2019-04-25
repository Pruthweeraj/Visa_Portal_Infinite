package com.infinite.visa_portal.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@Column(nullable = false)
	private Long employeeId;

	private String employeeName;

	@Column(nullable = false)
	private String employeeMailId;

	private LocalDate employeeDoj;

	private Float employeePreviousExperience;

	private Long employeeMobileNumber;

	private String projectManager;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	@JsonIgnore
	private Project project;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status statusId;

	public Employee() {
	}

	public Employee(Long employeeId, String employeeName, String employeeMailId, LocalDate employeeDoj,
			Float employeePreviousExperience, Long employeeMobileNumber, String projectManager, Project project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMailId = employeeMailId;
		this.employeeDoj = employeeDoj;
		this.employeePreviousExperience = employeePreviousExperience;
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

	public Float getEmployeePreviousExperience() {
		return employeePreviousExperience;
	}

	public void setEmployeePreviousExperience(Float employeePreviousExperience) {
		this.employeePreviousExperience = employeePreviousExperience;
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
