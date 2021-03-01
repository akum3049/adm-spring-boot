package com.cts.product;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listBooks(Model model, @RequestParam("page") Optional<Integer> page,
			@RequestParam("size") Optional<Integer> size) {
		int currentPage = page.orElse(1);
		int pageSize = size.orElse(5);

		Page<Product> productPage = productService.findPaginated(PageRequest.of(currentPage - 1, pageSize));

		System.out.println(">>>>>> " + productPage + "<<<<<<<<<<<<<");
		System.out.println(">>>>>> " + productPage.getContent() + "<<<<<<<<<<<<<");


		model.addAttribute("productPage", productPage);

		int totalPages = productPage.getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			model.addAttribute("pageNumbers", pageNumbers);
		}

		return "products2.html";
	}

	@RequestMapping("/listAll")
	public ModelAndView listAllProducts() {

		ModelAndView mav = new ModelAndView();

		List<Product> products = productService.listAllProducts();

		System.out.println(products.size());

		mav.addObject("products", products);

		mav.setViewName("products");

		return mav;

	}

	// get Data for Edit and Edit it

	@RequestMapping("/edit")
	public ModelAndView save(@RequestParam("id") int id) {
		System.out.println(">>> ID: " + id);

		ModelAndView mav = new ModelAndView("product-edit-form");

		Product product = productService.findById(id);
		mav.addObject("product", product);

		return mav;
	}

	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Product product) {
		ModelAndView mav = new ModelAndView("redirect:/listAll");
		productService.save(product);
		return mav;

	}

}
