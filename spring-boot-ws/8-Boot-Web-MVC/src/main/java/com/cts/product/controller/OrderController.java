package com.cts.product.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

	@GetMapping(value = "/d1")
	public String m1() {
		System.out.println(">>> m1 <<<");
		return "one";

	}

	@GetMapping(value = "/d2")
	public String m2(Model model) {
		// Model Object act like request object
		model.addAttribute("orderDate", LocalDateTime.now());
		model.addAttribute("orderType", "Samsung Mobile");
		return "two";
	}

	@GetMapping("/d3")
	public ModelAndView m3() {
		
		ModelAndView mav = new ModelAndView();

		mav.setViewName("two");
		mav.addObject("orderType", "Mac Book Pro Laptop");
		mav.addObject("orderDate", LocalDateTime.now());

		return mav;

	}

}
