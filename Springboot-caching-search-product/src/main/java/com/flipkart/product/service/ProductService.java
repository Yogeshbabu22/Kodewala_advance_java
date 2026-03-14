package com.flipkart.product.service;

import org.springframework.stereotype.Service;

import com.flipkart.product.entity.Product;

@Service
public interface ProductService {
	
	Product searchPrdouct(String name);

}
