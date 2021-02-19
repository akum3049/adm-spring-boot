package com.cts.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emp.dao.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl { // dependent

	// @Autowired
	private EmployeeDaoImpl dao; // dependency
	
	

	// 2 ways
	// way -1 : setter based
	// way -2 : constructor based

	//public void setDao(EmployeeDaoImpl dao) {
		//this.dao = dao;
	//}

	@Autowired
	public EmployeeServiceImpl(EmployeeDaoImpl dao) {
		this.dao = dao;
	}

	public void save() {
		System.out.println("Service: EmployeeService save method called...");
		dao.save();
	}

}
