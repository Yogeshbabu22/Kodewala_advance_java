package com.zepto.order.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.controller.request.OrderInput;
import com.zepto.order.controller.request.ProductInput;

@RestController
public class OrderController {
	@PostMapping("placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderInput orderInput) {
		System.out.println("Order ID: " + orderInput.getOrderId());
		orderInput.getProducts().forEach(product ->{
			System.out.println("Product: " + product.getItemName()
			+ " | ID : " + product.getProductId()
			+ " | Price: " + product.getPrice()
			+ " | Qty: " + product.getQty());
		});
		return ResponseEntity.ok("Order Recieved");
	
	}
	

	

}
