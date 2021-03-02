package com.cts.product.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductRestController {
	
	
	
	Product p1=new Product(1, "Abc", 87, "D1");
	Product p2=new Product(2, "Xyz", 35, "D2");
	Product p3=new Product(3, "Aba", 82, "D3");
	
	List<Product> products=Arrays.asList(p1,p2,p3);


	
	
	@GetMapping
	public List<Product> m6(){
		return products;
	}
	
	@GetMapping("/product")
	public Product m1() {
		return new Product(10, "Pen", 87, "Red Ink Ball Pen");
	}
	
	

	@GetMapping("/cities")
	public Object[] m5() {
		String[] cities= {"Chennai","Mumbai","Pune","Kolkata","Hyderabad"};
		return cities;
	}
	
	
	
	@PostMapping
	public String m2() {
		return "ProductRestController:: POST Mapping";
	}
	
	@PutMapping
	public String m3() {
		return "ProductRestController:: PUT Mapping";
	}
	
	@DeleteMapping
	public String m4() {
		return "ProductRestController:: DELETE Mapping";
	}

}
