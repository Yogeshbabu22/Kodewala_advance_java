package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.request.AccountCreateRequest;
import com.bank.request.PaymentRequest;
import com.bank.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	//l
	@PostMapping("accountCreation")
	public String accountCreation(@RequestBody AccountCreateRequest accountCreateRequest) {
		paymentService.createAccount(accountCreateRequest);
		return "Account Created Successfully";
		
	}
	@PostMapping("fundTransfer")
	public String fundTransfer(@RequestBody PaymentRequest paymentRequest) {
		paymentService.moneyTransfer(paymentRequest);
		return "Paise de diya bhai..........";
		
	}
	
	

}
