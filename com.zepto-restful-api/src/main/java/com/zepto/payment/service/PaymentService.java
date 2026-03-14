package com.zepto.payment.service;

import org.springframework.stereotype.Service;

import com.zepto.payment.bean.PayementInfo;

@Service
public interface PaymentService {
	
	
	
	public int pay(PayementInfo paymentInfo);

}
