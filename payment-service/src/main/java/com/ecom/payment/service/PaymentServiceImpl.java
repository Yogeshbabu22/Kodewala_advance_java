package com.ecom.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.payment.entity.PaymentEntity;
import com.ecom.payment.exception.InvalidPaymentStatusException;
import com.ecom.payment.repository.PaymentRepository;
import com.ecom.payment.request.PaymentRequest;
import com.ecom.payment.request.PaymentResponse;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public PaymentResponse processPayment(PaymentRequest paymentRequest) {


  
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setOrdrId(paymentRequest.getOrdrId());
        paymentEntity.setAmount(paymentRequest.getAmout());
        paymentEntity.setStatus("SUCCESS");

        paymentEntity = paymentRepository.save(paymentEntity);
        
        System.out.println("PAyment id is : "+paymentEntity.getPaymentId());
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentEntity.getPaymentId());
        response.setPaymentStatus(paymentEntity.getStatus());
        
        return response;
    }
}
