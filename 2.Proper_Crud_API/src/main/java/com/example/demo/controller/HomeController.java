package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String getName() {
		return "Name";
	}

	
	@GetMapping
	public String getCity() {
		return "City";
	}
	
	
	
	@GetMapping
	public String getAge() {
		return "Age";
	}



}
