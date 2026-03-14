package com.ecom.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.order.entity.OrderEntity;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	
	 List<OrderEntity> findByProductName(String productName);
	 List<OrderEntity> findByProductNameContainingIgnoreCase(String productName);

}
