package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String welcome() {
		return "index";
	}

	@GetMapping("/loadForm")
	public String loadProductForm() {
		return "product-form";
	}

	@GetMapping("/saveProduct")
	public String saveProduct(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("price") double price, @RequestParam("description") String desc) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Description: " + desc);

		return "product-form";
	}

	@PostMapping("/saveProductV1")
	public String saveProductV1(@ModelAttribute Product prod) {

		System.out.println("V1- ID: " + prod.getId());
		System.out.println("V1- Name: " + prod.getName());
		System.out.println("V1- Price: " + prod.getPrice());
		System.out.println("V1- Desc : " + prod.getDescription());

		// save prod to DB

		productService.save(prod);
		return "redirect:/loadProducts";
	}

	@GetMapping("/loadProducts")
	public ModelAndView listAllProducts(){
		
		ModelAndView mav=new ModelAndView("products");
		
		
		mav.addObject(productService.listAllProducts());
		
		
		return mav;
		
	}

}
