package com.cts.product.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;
	
	
	
	 public Page<Product> findPaginated(Pageable pageable) {
		 
		    final List<Product> products = prodDao.findAll();

		 
	        int pageSize = pageable.getPageSize();
	        int currentPage = pageable.getPageNumber();
	        int startItem = currentPage * pageSize;
	        
	        
	        List<Product> list;

	        if (products.size() < startItem) {
	            list = Collections.emptyList();
	        } else {
	            int toIndex = Math.min(startItem + pageSize, products.size());
	            list = products.subList(startItem, toIndex);
	        }

	        Page<Product> productPage
	          = new PageImpl<Product>(list, PageRequest.of(currentPage, pageSize), products.size());

	        return productPage;
	    }
	
	

	@Override
	public Product save(Product product) {
		return prodDao.save(product);
	}

	@Override
	public List<Product> listAllProducts() {
		return prodDao.findAll();
	}

	@Override
	public Product findById(int id) {
		return prodDao.findById(id).orElse(null);
	}

	@Override
	public void deleteProduct(int id) {
		prodDao.deleteById(id);
	}

}
