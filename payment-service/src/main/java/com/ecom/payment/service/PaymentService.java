package com.ecom.payment.service;

import com.ecom.payment.request.PaymentRequest;
import com.ecom.payment.request.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse processPayment(PaymentRequest paymentRequest);

}
