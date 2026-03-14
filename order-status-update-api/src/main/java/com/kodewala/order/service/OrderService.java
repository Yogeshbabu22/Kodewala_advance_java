package com.kodewala.order.service;

import org.springframework.stereotype.Service;

import com.kodewala.order.request.OrderRequest;
import com.kodewala.order.response.OrderResponse;

@Service
public interface OrderService {
	
	int placeOrder(OrderRequest orderRequest);
	
	OrderResponse statusUpdate(int productId,String newStataus);

}
