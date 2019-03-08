package com.infinite.visa_portal;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.infinite.visa_portal.entity.Employee;
import com.infinite.visa_portal.entity.Project;
import com.infinite.visa_portal.repository.EmployeeRepository;
import com.infinite.visa_portal.repository.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

	// Adding a slf4j Logger
	Logger logger = LoggerFactory.getLogger(EmployeeRepositoryTest.class);

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void addEmployee() {
		Project project = new Project("Scrips", "Chandra");
		projectRepository.save(project);

		Employee employee = new Employee(1805569L, "Sagar Sahu", "sagar@infinite.com", LocalDate.of(2016, 10, 10), 0F,
				9938457852L, "Arun", project);
		employeeRepository.save(employee);

	}

}
