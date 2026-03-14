package com.flipkart.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.product.entity.Product;
import com.flipkart.product.service.ProductService;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/search")
	public Product searchProduct(String name) {
		
		System.out.println("API Started.....");
		System.out.println("Searching Product .... ");
		System.out.println("API Started.....");
		
		return productService.searchPrdouct(name);
		
	}

}
