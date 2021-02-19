package com.cts.emp.service;

import org.springframework.stereotype.Service;

@Service("hrService")
public class HRServiceImpl implements EmployeeService {

	@Override
	public void save() {

		System.out.println("HRService class save method");
	}

}
