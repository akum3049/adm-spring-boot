package com.cts.product.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "c2Obj")
@Scope("prototype")
public class C2 {
	
	public String name="Praveen";

	public C2() {
		System.out.println("--- C2 class object created with hashcode "+System.identityHashCode(this));
	}

	public void f4() {
		System.out.println("--- f4 method of C2 class  by "+System.identityHashCode(this));

	}

}
