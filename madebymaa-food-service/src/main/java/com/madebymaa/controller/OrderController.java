package com.madebymaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.madebymaa.order.request.OrderRequest;
import com.madebymaa.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/createOrder")
	public String createOrder(@RequestBody OrderRequest OrderRequest) {
		int orderId = orderService.placeOrder(OrderRequest);
		return "Your order has been placed successfully";
		
		
		
		
	}

}
