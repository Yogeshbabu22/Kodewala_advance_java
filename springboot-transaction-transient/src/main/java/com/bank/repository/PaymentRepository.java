package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.PaymentEntity;
@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
	
	 public PaymentEntity findByaccountNumber(String accountNumber);
	
	

}
