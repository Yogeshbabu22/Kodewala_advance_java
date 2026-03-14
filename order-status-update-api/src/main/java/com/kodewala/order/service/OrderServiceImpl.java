package com.kodewala.order.service;



import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.order.entity.OrderEntity;
import com.kodewala.order.exception.InvalidIdException;
import com.kodewala.order.repositoy.OrderRepo;
import com.kodewala.order.request.OrderRequest;
import com.kodewala.order.response.OrderResponse;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public int placeOrder(OrderRequest orderRequest) {
		
		OrderEntity entity = new OrderEntity();
		entity.setDescription(orderRequest.getDescription());
		entity.setProductName(orderRequest.getProductName());
		entity.setPrice(orderRequest.getPrice());
		entity.setStatus(orderRequest.getStatus());
		entity = orderRepo.save(entity);
		return entity.getProductId();
	}

	@Override
	public OrderResponse statusUpdate(int productId, String newStatus) {
		try {
		OrderEntity entity = orderRepo.findById(productId).get();
		entity.setStatus(newStatus);
		entity = orderRepo.save(entity);
		
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setItemName(entity.getProductName());
		orderResponse.setAmount(entity.getPrice());
		orderResponse.setStatus(entity.getStatus());
		return orderResponse;
		
		}catch(NoSuchElementException e)
		{
			throw new InvalidIdException("No data found.. Invalid id "+productId);
		}
	}

}
