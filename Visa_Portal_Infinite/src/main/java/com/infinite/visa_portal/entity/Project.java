package com.infinite.visa_portal.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Long projectId;

	private String projectName;

	private String projectOwner;

	@OneToMany(mappedBy = "project")
	private List<Employee> employees = new ArrayList<>();

	public Project() {
	}

	public Project(Long projectId, String projectName, String projectOwner) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectOwner = projectOwner;
	}

	public Project(String projectName, String projectOwner) {
		this.projectName = projectName;
		this.projectOwner = projectOwner;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}

}