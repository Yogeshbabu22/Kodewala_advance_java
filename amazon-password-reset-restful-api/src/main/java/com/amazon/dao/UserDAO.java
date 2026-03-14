
package com.amazon.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.entity.PasswordLog;
import com.amazon.entity.Users;

@Repository
public class UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public int createUser(Users users) {
		System.out.println("Inside Create IUser...");
		Session session = sessionFactory.openSession();
		Transaction trxn = session.beginTransaction();
		
		Integer userId = (Integer) session.save(users);
		
		PasswordLog passwordLog = new PasswordLog();
		passwordLog.setUserId(userId);
		passwordLog.setCurrentPassword(users.getPassword());
		
		session.save(passwordLog);
		trxn.commit();
		return  userId;
		
	
		
	}
	

}
