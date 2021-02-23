package com.cts.product.entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductDao extends MongoRepository<Product, Object> {

	 
	
}
