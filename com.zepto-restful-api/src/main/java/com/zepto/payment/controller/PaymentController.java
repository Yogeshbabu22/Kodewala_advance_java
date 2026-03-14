package com.zepto.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.payment.bean.PayementInfo;
import com.zepto.payment.entity.Payment;
import com.zepto.payment.service.PaymentService;

@Controller
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	@PostMapping("confirmPayment")
	@ResponseBody
	public ResponseEntity confirmPayment(@RequestBody PayementInfo paymentInfo)  {  
		System.out.println("Payment Info: "+ paymentInfo.getPaymentRef() + " " + paymentInfo.getAmount());
		
		int paymentId = paymentService.pay(paymentInfo);
		return ResponseEntity.ok(paymentId);
	}

}
