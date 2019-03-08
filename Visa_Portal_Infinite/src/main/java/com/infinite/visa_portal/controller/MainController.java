package com.infinite.visa_portal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infinite.visa_portal.entity.Employee;
import com.infinite.visa_portal.service.EmployeeService;

@Controller
public class MainController {

	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/Visa_Portal_Infinite/submitLoginForm")
	public ModelAndView login(@RequestParam Map<String, String> requestParam) {
		System.out.println("Inside sublitLogiForm");
		String userName = requestParam.get("userName");
		String password = requestParam.get("password");

		if (userName.equalsIgnoreCase("pr") && password.equalsIgnoreCase("pr")) {
			ModelAndView modelAndView = new ModelAndView("Success");
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("Login");
			return modelAndView;
		}

	}

	@GetMapping("/Login")
	public ModelAndView showLoginPage() {
		System.out.println("Inside /login");
		ModelAndView modelAndView = new ModelAndView("Login");
		return modelAndView;
	}

	@GetMapping("/viewEmployees")
	public ModelAndView viewEmployee() {
		System.out.println("Inside /viewEmployees");
		ModelAndView modelAndView = new ModelAndView("ViewEmployees");
		
		List<Employee> employees = employeeService.ShowAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName());
		}
		modelAndView.addObject("employees" , employees);
		return modelAndView;
	}

	
}
