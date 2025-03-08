package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;

@RestController 
public class ProductController {
	
	
	@PostMapping("/get")
	public String saveData(@RequestBody Product p) {
		
		return "Data saved Successfully";
	}

	 
}
