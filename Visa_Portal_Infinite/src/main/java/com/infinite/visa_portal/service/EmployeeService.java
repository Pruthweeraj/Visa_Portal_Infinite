package com.infinite.visa_portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.visa_portal.entity.Employee;
import com.infinite.visa_portal.logic.BusinessLogic;
import com.infinite.visa_portal.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	BusinessLogic busenessLogic;
	
	public List<Employee> ShowAllEmployees() {

		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	public List<Employee> showEmployeeByProjectManager(String projectManager) {

		return employeeRepository.findByProjectManager(projectManager);
	}

	public List<Employee> eligibleEmployees(String projectManager) {

		return busenessLogic.CheckEligibility(showEmployeeByProjectManager(projectManager));
	}
}
