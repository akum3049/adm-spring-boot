package com.cts.emp.service;

import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	public EmployeeServiceImpl() {
		System.out.println("-- EmployeeService object created...");
	}
	
	@Override
	public void save() {
		System.out.println("save method of EmployeeService class");
	}

}
