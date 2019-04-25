package com.infinite.visa_portal.logic;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infinite.visa_portal.entity.Employee;

@Service
public class BusinessLogic {

	float requiredYearOfExperience = 2;

	// Eligibility for initiating a visa
	public List<Employee> CheckEligibility(List<Employee> employees) {
		List<Employee> eligibleEmployee = new ArrayList<Employee>();

		for (Employee employee : employees) {

			LocalDate today = LocalDate.now(); // Today's date
			LocalDate joiningDay = employee.getEmployeeDoj(); // Company joining Date

			Period period = Period.between(joiningDay, today);

			// Now access the values as below
			System.out.println(period.getYears());

			if (period.getYears() + employee.getEmployeePreviousExperience() >= requiredYearOfExperience) {

				eligibleEmployee.add(employee);
			}

		}
		return eligibleEmployee;
	}

}
