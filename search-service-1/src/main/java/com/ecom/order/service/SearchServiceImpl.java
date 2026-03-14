package com.ecom.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.order.entity.OrderEntity;
import com.ecom.order.repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	SearchRepository searchRepository;

	@Override
	public OrderEntity searchOrder(String name) {
		
		OrderEntity entity = searchRepository.findByProductName(name);
		return entity;
	}
	
	
	

}
