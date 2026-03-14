package com.zepto.search.service;

import org.springframework.stereotype.Service;

import com.zepto.search.exception.ProductNotFoundException;

@Service
public class ProductService {
	public void findProductBySearchString(String _searchString) {
		boolean IsProductFound = true;
		if (IsProductFound) {
			throw new ProductNotFoundException("Product not find");
		}else {
			//Send the product search results;
		}
	}

}
