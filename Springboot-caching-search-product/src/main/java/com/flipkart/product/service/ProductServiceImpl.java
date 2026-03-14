package com.flipkart.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.flipkart.product.entity.Product;
import com.flipkart.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Cacheable(value = "item name", key = "#name", unless = "#result == null")
	@Override
	public Product searchPrdouct(String name) {

		System.out.println("Fetching product from DB......");
		return productRepo.findByName(name).orElseThrow(() -> new RuntimeException("Product not Found"));
	}

}
