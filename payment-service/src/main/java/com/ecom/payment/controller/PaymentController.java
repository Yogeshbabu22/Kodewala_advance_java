package com.ecom.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.payment.request.PaymentRequest;
import com.ecom.payment.request.PaymentResponse;
import com.ecom.payment.service.PaymentService;

@RestController
public class PaymentController {

	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	PaymentService paymentService;

	@PostMapping("makePayment")
	public ResponseEntity<PaymentResponse> makePayment(@RequestBody PaymentRequest paymentRequest) {

		log.info("TraceId: {}, SpanId: {}", MDC.get("traceId"), MDC.get("spanId"));

		PaymentResponse response = paymentService.processPayment(paymentRequest);

		log.info("Payment processed successfully");

		return ResponseEntity.ok(response);
	}
}
