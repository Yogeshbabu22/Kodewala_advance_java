package com.zepto.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.product.bean.ProductInfo;
import com.zepto.product.bean.SearchRequest;
import com.zepto.product.entity.Product;
import com.zepto.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity createProduct(@RequestBody ProductInfo productInfo) {
		System.out.println("Product Details: " + productInfo.getItemName() + " " + productInfo.getPrice());
		productService.addProductService(productInfo);

		return ResponseEntity.ok("Product Saved");
	}
	
	@GetMapping("searchProduct")
	public ResponseEntity searchProduct(@RequestBody SearchRequest searchRequest) {

		List<Product> list = new ArrayList<Product>();

		list =  productService.findProductBySearchString(searchRequest.getSearchString());

		return ResponseEntity.ok(list);

	}
	

}
