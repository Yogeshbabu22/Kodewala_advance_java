package com.amazon.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.entity.PasswordLog;
import com.amazon.exception.EmailNotExistException;
import com.amazon.exception.PassowordResetFailException;
import com.amazon.request.ResetPassword;

@Repository
public class ResetPasswordDAO {

	@Autowired
	SessionFactory sessionFactory;

	Session session;
	Transaction txn;

	public String swapPassword(String newPassword, PasswordLog passwordLog) {
		passwordLog.setOldestPassword(passwordLog.getOldPassword());
		passwordLog.setOldPassword(passwordLog.getCurrentPassword());
		passwordLog.setCurrentPassword(newPassword);

		session.update(passwordLog);
		txn.commit();
		return "Password Reset Successfull";
	}

	public PasswordLog getPasswordLog(String currentEmail) {
		// TODO Auto-generated method stub
		System.out.println("Inside ResetPasswordDAO....");
		session = sessionFactory.openSession();
		txn = session.beginTransaction();

		String hql = "SELECT userId FROM Users WHERE email = :email";

		Integer currentUserId = (Integer) session.createQuery(hql).setParameter("email", currentEmail).uniqueResult();
		if (currentUserId == null) {
			throw new EmailNotExistException("Wrong email.. or Email not exist..");
		}
		String logHql = "FROM PasswordLog WHERE userId = :uid";
		PasswordLog passwordLog = (PasswordLog) session.createQuery(logHql).setParameter("uid", currentUserId)
				.uniqueResult();

		return passwordLog;

	}
}
