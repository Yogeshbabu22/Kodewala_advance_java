package com.ecom.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.order.client.PaymentClient;
import com.ecom.order.entity.OrderEntity;
import com.ecom.order.exception.PaymentFailedException;
import com.ecom.order.repository.OrderRepository;
import com.ecom.order.request.OrderRequest;
import com.ecom.order.request.PaymentRequest;
import com.ecom.order.response.PaymentResponse;
import com.ecom.order.service.kafka.KafkaProducerService;

import jakarta.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentClient paymentClient;
    @Autowired
    KafkaProducerService kafkaProducerService;
    
    @Override
    @Transactional
    public int createOrder(OrderRequest orderRequest) {
        OrderEntity entity = new OrderEntity();
        entity.setProductName(orderRequest.getProductName());
        entity.setPrice(orderRequest.getPrice());
        entity.setQuantity(orderRequest.getQuantity());
        entity = orderRepository.save(entity);
        
        System.out.println("xyxxxxxxxxxxxxxxxxxxxxxxx");
        PaymentRequest request = new PaymentRequest();
        request.setOrdrId(entity.getOrderId());
        request.setAmout(entity.getPrice());
        
        PaymentResponse response= paymentClient.makePayment(request);
        
        System.out.println("Payment id is: "+response.getPaymentId());
        
        if(!response.getPaymentStatus().equals("SUCCESS"))
        {
        	throw new PaymentFailedException("Payment failed..! "+response.getPaymentStatus());
        }
        
        kafkaProducerService.sendMessage("Payment succesfully done .Your order id is : " +entity.getOrderId());
        return entity.getOrderId();
    }
}
