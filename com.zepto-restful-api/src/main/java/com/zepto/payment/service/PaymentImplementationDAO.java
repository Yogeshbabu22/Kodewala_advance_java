package com.zepto.payment.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zepto.payment.entity.Payment;
import com.zepto.payment.exception.PaymentFailedException;

@Repository
public class PaymentImplementationDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public int confirmPayment(Payment payment) {
		Session session = sessionFactory.openSession();
		
		Transaction trxn = session.beginTransaction();
		Integer paymentId = (Integer)session.save(payment);
		trxn.commit();
		
		System.out.println("Payment Confirmed..........."+payment);
		
		boolean flag = true;
		if(flag) {
			throw new PaymentFailedException("Payment Failed....");
		}else {
			return paymentId;
		}
		
		
		
		
	}

}
