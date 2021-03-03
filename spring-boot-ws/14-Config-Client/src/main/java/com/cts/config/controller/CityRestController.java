package com.cts.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/cities")
public class CityRestController {

	@Value("${cityName}")
	private String myCity;

	@GetMapping
	public String test() {
		return myCity + " Welcomes you.";
	}

}
