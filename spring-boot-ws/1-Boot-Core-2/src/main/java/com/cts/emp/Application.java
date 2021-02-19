package com.cts.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.emp.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		EmployeeService es = ac.getBean("hrService",EmployeeService.class);
		
		//EmployeeService es1 = ac.getBean("accService",EmployeeService.class);
		
		
		es.save();
		//es1.save();
		
		
		
	}

}
