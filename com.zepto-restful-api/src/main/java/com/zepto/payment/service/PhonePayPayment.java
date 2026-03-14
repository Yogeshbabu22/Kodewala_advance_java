package com.zepto.payment.service;

import org.springframework.stereotype.Service;

import com.zepto.payment.bean.PayementInfo;
@Service
public class PhonePayPayment implements PaymentService {

	@Override
	public int pay(PayementInfo paymentInfo) {
		return 0;
		
	}

}
