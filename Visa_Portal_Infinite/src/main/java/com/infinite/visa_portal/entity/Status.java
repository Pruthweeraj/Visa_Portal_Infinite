package com.infinite.visa_portal.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Status {

	@Id
	//@Column(nullable = false)
	private Long statusId;
	
	@OneToMany(mappedBy = "statusId")
	private List<Employee> employeeIds = new ArrayList<Employee>();

	@OneToOne
	private StatusDesc statusDescId;

	private int statusYear;	
	

	public Status() {
		
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	
	public List<Employee> getEmployeeIds() {
		return employeeIds;
	}

	public void addEmployeeId(Employee employeeId) {
		this.employeeIds.add(employeeId);
	}

	public StatusDesc getStatusDescId() {
		return statusDescId;
	}

	public void setStatusDescId(StatusDesc statusDescId) {
		this.statusDescId = statusDescId;
	}

	public int getStatusYear() {
		return statusYear;
	}

	public void setStatusYear(int statusYear) {
		this.statusYear = statusYear;
	}

	

}
