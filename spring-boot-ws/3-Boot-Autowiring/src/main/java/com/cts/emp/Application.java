package com.cts.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		EmployeeServiceImpl es = ac.getBean(EmployeeServiceImpl.class);
		es.save();
		
		//EmployeeDaoImpl dao = ac.getBean(EmployeeDaoImpl.class);
		//dao.save();
	}

}
