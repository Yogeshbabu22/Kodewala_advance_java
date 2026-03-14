package com.madebymaa.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madebymaa.kafka.producer.OrderProducer;
import com.madebymaa.order.entity.OrderEntity;
import com.madebymaa.order.request.OrderRequest;
import com.madebymaa.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	OrderProducer orderProducer ;
	@Override
	public int placeOrder(OrderRequest orderRequest) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setCustomerName(orderRequest.getCustomerName());
		orderEntity.setFoodItem(orderRequest.getFoodItem());
		orderEntity.setPrice(orderRequest.getPrice());
		orderEntity.setQuantity(orderRequest.getQuantity());
		orderEntity =orderRepository.save(orderEntity);
		
		
		orderProducer.emailSender("Yor order is now being processed and will be on its way to you shortly.........");
		return orderEntity.getOrderID();
	}

}
