package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Product;

@RestController 
public class ProductController {

	@GetMapping("get_product")
	public List<Product> getAllProduct()
	{
		return new ArrayList<>();
	}
	 
}
