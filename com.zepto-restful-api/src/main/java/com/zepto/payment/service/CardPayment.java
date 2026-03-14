package com.zepto.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.zepto.payment.bean.PayementInfo;
import com.zepto.payment.entity.Payment;
@Primary
@Service
public class CardPayment implements PaymentService {
	@Autowired
	PaymentImplementationDAO paymentImplementationDAO;

	@Override
	public int pay(PayementInfo paymentInfo) {
		Payment payment = new Payment();
		payment.setPaymentRef(paymentInfo.getPaymentRef());
		payment.setOrderId(paymentInfo.getOrderId());
		payment.setAmount(paymentInfo.getAmount());
		payment.setStatus(paymentInfo.getStatus());
		payment.setDescription(paymentInfo.getDescription());
		
		int paymentId = paymentImplementationDAO.confirmPayment(payment);
		return paymentId;
		
		
	
		
		
	}

}
