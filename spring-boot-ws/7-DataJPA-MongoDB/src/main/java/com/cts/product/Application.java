package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.ProductDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ApplicationContext ac=	SpringApplication.run(Application.class, args);
	 
	 ProductDao prodDao = ac.getBean(ProductDao.class);
	 
	 prodDao.findAll().forEach(product->{
		 System.out.println("ID: "+product.getId());
		 System.out.println("Name: "+product.getName());
		 System.out.println("Price: "+product.getPrice());
		 System.out.println("Desceription: "+product.getDescription());
		 System.out.println("--------------------------------------------");
	 });
	 
	}
	
	

}
