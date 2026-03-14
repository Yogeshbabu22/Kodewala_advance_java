package com.kodewala.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.order.request.OrderRequest;
import com.kodewala.order.request.OrderStatusRequest;
import com.kodewala.order.response.OrderResponse;
import com.kodewala.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("createOrder")
	public int createOrder(@RequestBody OrderRequest orderRequest) {
		System.out.println("Product Name : "+ orderRequest.getProductName() );
		int orderShow = orderService.placeOrder(orderRequest);
		return orderShow;
		
	}
	
	@PutMapping("/orders/{productId}/status")
	public ResponseEntity<OrderResponse> statusUpdateOrder(@PathVariable int productId,@RequestBody OrderStatusRequest orderStatusRequest) 
	{
		OrderResponse orderResponse = orderService.statusUpdate(productId, orderStatusRequest.getNewStatus());
		return ResponseEntity.ok(orderResponse);
	}

}
