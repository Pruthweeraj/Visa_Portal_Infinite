package com.infinite.visa_portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.visa_portal.entity.Employee;
import com.infinite.visa_portal.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> ShowAllEmployees(){
		
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}
}
