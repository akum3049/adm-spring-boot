package com.cts.product.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cts.product.entity.Product;

public interface ProductService {

	public Page<Product> findPaginated(Pageable pageable);

	Product save(Product product);

	List<Product> listAllProducts();

	Product findById(int id);

	void deleteProduct(int id);

}