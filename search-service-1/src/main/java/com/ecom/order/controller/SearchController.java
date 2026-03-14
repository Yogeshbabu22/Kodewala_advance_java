package com.ecom.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.order.entity.OrderEntity;
import com.ecom.order.service.SearchService;

@RestController
public class SearchController {
	
	
	@Autowired
	SearchService searchService;
	
	@GetMapping("searchProduct")
	public String searchProduct(@RequestParam String name) {
		OrderEntity product = searchService.searchOrder(name);
		return "Your Products fetched succesfully"+product.getProductName() ;
		
	}
	
	

}
