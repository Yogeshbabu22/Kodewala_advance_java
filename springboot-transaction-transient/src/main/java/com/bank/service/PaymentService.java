package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.PaymentEntity;
import com.bank.exception.InsufficientBalanceException;
import com.bank.exception.InvalidAccountNoException;
import com.bank.repository.PaymentRepository;
import com.bank.request.AccountCreateRequest;
import com.bank.request.PaymentRequest;

import jakarta.transaction.Transactional;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	public String createAccount(AccountCreateRequest accountCreateRequest) {
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setAccountNumber(accountCreateRequest.getAccountNumber());
		paymentEntity.setAmount(accountCreateRequest.getAmount());
		paymentEntity.setPassword(accountCreateRequest.getPassword());
		paymentEntity.setPhoneNumber(accountCreateRequest.getPhoneNumber());
		paymentEntity.setStatus(accountCreateRequest.getStatus());
		paymentRepository.save(paymentEntity);
		return "Account Creation Successfull.......";
	}
	@Transactional
	public String moneyTransfer(PaymentRequest paymentRequest) {
		String fromAccountNum = paymentRequest.getFromAccountNum();
		double amountToBeTransfer = paymentRequest.getAmount();
		PaymentEntity accountNumberDetails = paymentRepository.findByaccountNumber(fromAccountNum);
		if(accountNumberDetails==null)
		{
			throw new InvalidAccountNoException("No record found.. Invalid account no: "+fromAccountNum);
		}
		accountNumberDetails.setPassword("Nikhil");
		
		if(accountNumberDetails.getAmount()<amountToBeTransfer)
		{
			throw new InsufficientBalanceException("Insufficient balance : "+amountToBeTransfer);
		}
		accountNumberDetails.setAmount(accountNumberDetails.getAmount() - amountToBeTransfer);

		paymentRepository.save(accountNumberDetails);

		String toAccountNum = paymentRequest.getToAccountNum();
		PaymentEntity toAccountNumberDetails = paymentRepository.findByaccountNumber(toAccountNum);
		
		if(toAccountNumberDetails==null)
		{
			throw new InvalidAccountNoException("No record found.. Invalid account no: "+toAccountNum);
		}
		toAccountNumberDetails.setAmount(toAccountNumberDetails.getAmount() + amountToBeTransfer);
		paymentRepository.save(toAccountNumberDetails);

		return "Money Transfer Successfully...............";

	}

}
