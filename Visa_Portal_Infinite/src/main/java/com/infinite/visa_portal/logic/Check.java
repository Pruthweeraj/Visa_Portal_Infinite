package com.infinite.visa_portal.logic;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infinite.visa_portal.entity.Employee;
import com.infinite.visa_portal.entity.Project;
import com.infinite.visa_portal.repository.EmployeeRepository;
import com.infinite.visa_portal.repository.ProjectRepository;

@Component
@Transactional
public class Check {
	// Adding a slf4j Logger
	Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	
	public void addEmployee() {
		Project project = new Project( "Scripps", "Chandra");
		projectRepository.save(project);
		projectRepository.flush();
		Employee employee = new Employee(111L, "Sagar Sahu", "sagar@infinite.com", LocalDate.of(2016, 10, 10), 0F,
				9938457852L, "Arun", project);
		employeeRepository.save(employee);

	}

	
	
	
	public void addProject() {
		Project project = new Project(145L ,"ujhsdc","oijxcj");
		projectRepository.save(project);
	}




	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}




	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}




	public ProjectRepository getProjectRepository() {
		return projectRepository;
	}




	public void setProjectRepository(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	
}
