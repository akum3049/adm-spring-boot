package com.cts.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "c1Obj") // bean name
@Lazy
public class C1 {

	public C1() {
		System.out.println("--- C1 class object created..");
	}

	@Bean
	public static void f2() {
		System.out.println("--- f2 method of C1 class");
	}

	@Bean
	public void f1() {
		System.out.println("--- f1 method of C1 class");
	}

	public void f3() {
		System.out.println("--- f3 method of C1 class");

	}

}
