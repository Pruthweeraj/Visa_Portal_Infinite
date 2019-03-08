package com.infinite.visa_portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infinite.visa_portal.logic.Check;

@SpringBootApplication
public class VisaPortalInfiniteApplication implements CommandLineRunner {

	@Autowired
	Check check;

	public static void main(String[] args) {
		SpringApplication.run(VisaPortalInfiniteApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		check.addEmployee();
		// check.addProject();
	}

}
