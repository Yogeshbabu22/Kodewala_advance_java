package com.ecom.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.order.request.OrderRequest;
import com.ecom.order.service.OrderService;

@RestController
public class OrderController {

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderService orderService;

	@PostMapping("placeOrder")
	public String placeOrder(@RequestBody OrderRequest orderRequest) {

		log.info("TraceId: {}, SpanId: {}", MDC.get("traceId"), MDC.get("spanId"));

		int orderId = orderService.createOrder(orderRequest);

		log.info("Order placed successfully with OrderId: {}", orderId);

		return "Order is been placed..." + orderId;
	}
}
