package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String getName() {
		return "Name";
	}

@postMapping
	public String saveRecord() {
		return "Name";
	}

}
