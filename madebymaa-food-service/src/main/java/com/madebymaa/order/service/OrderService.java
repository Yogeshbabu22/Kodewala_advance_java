package com.madebymaa.order.service;

import com.madebymaa.order.request.OrderRequest;

public interface OrderService {
	
	public int placeOrder(OrderRequest orderRequest);

}
