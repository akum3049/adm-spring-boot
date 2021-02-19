package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cts.product.service.C2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Application.class, args);

		//C1 c1 = (C1) ac.getBean("c1Obj");
		//c1.f3();
		
		 C2 c2Obj1=ac.getBean(C2.class);
		 C2 c2Obj2=ac.getBean(C2.class);
		 
		 c2Obj1.f4();
		 c2Obj2.f4();
		 
		 c2Obj1.name="Ozvitha";
		 
		 System.out.println("Name by c2Obj1: "+c2Obj1.name);
		 System.out.println("Name by c2Obj2: "+c2Obj2.name);

		 
		 
		 
		
		
		

	}

}
