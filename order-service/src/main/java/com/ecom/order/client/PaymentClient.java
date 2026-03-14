package com.ecom.order.client;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;

import com.ecom.order.request.PaymentRequest;
import com.ecom.order.response.PaymentResponse;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@FeignClient(name = "payment-service")
public interface PaymentClient {
	
	@CircuitBreaker(name = "paymentServiceCB", fallbackMethod = "fallbackPayment")
	@Retry(name = "paymentServiceRetry")

	@PostMapping("makePayment")
	PaymentResponse makePayment(PaymentRequest request);
	
	
	default PaymentResponse fallbackPayment(Long id, Throwable ex) {
		// this will get triggred / executed if CB executes.
		//
	    throw new RuntimeException("Product service is unavailable");
	}
}

