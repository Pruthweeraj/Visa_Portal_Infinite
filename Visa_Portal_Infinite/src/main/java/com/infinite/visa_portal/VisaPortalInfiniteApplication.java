package com.infinite.visa_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infinite.visa_portal.logic.Check;

@SpringBootApplication
@EnableAutoConfiguration
//@SpringBootConfiguration
public class VisaPortalInfiniteApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisaPortalInfiniteApplication.class, args);
		
		try {
			Thread.sleep(3000);
			Check check = new Check();
			check.addEmployee();
			//check.addProject();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
