package com.meesho.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meesho.product.entity.Product;
import com.meesho.product.service.ProductService;
@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/search")
	public Product search(@RequestParam String name) {
		
		System.out.println("API Started.....");
		System.out.println("Searching Product .... ");
		return productService.searchProduct(name);
		
		
	}

}
