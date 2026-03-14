package com.ecom.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.order.entity.OrderEntity;

@Repository
public interface SearchRepository extends JpaRepository<OrderEntity, Integer>{
	
	OrderEntity findByProductName(String name);

}
