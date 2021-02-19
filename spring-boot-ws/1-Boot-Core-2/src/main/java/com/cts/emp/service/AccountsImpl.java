package com.cts.emp.service;

import org.springframework.stereotype.Service;

@Service("accService")
public class AccountsImpl implements EmployeeService {

	@Override
	public void save() {
		System.out.println("-- AccountsImpl class save method");

	}
}
