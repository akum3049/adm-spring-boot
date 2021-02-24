package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ProductController {
	
	/*
	 * Web HTTP request methods
	 * ====================================================
	 * 1. GET		: GET data from server to client
	 * 2. POST		: POST data from client to server
	 * 3. DELETE	: Delete data from server
	 * 4. PUT		: Update/Modify Data from Server
	 * 5. PATCH		: Partial update data from Server
	 */
	
	
	@GetMapping(value = "/s1")
	public void f1() {
		System.out.println("<<<<<<< GET Mapping:: ProductController of f1 method >>>>>>>");
	}
	
	@GetMapping(value = "/s1/v1")
	public void f7() {
		System.out.println("<<<<<<< GET Mapping:: ProductController of f1 method >>>>>>>");
	}
	
	@PostMapping(value = "/s1")
	public void f3() {
		System.out.println("<<<<<<<POST Mapping::  ProductController of f1 method >>>>>>>");
	}
	@PutMapping(value = "/s1")
	public void f4() {
		System.out.println("<<<<<<<PUT Mapping::  ProductController of f1 method >>>>>>>");
	}
	@DeleteMapping(value = "/s1")
	public void f5() {
		System.out.println("<<<<<<<DELETE Mapping::  ProductController of f1 method >>>>>>>");
	}
	
	@PatchMapping(value = "/s1")
	public void f6() {
		System.out.println("<<<<<<<PATCH Mapping::  ProductController of f1 method >>>>>>>");
	}
	
	@GetMapping(value = "/s2")
	public void f2() {
		System.out.println("<<<<<<< ProductController of f2 method >>>>>>>");
	}
	

}
