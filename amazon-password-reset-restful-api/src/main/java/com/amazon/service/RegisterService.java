package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.dao.UserDAO;
import com.amazon.entity.Users;
import com.amazon.request.UserInfo;

@Service
public class RegisterService {
	@Autowired
	UserDAO userDAO;
	
	public int registerUserService(UserInfo userInfo)
	{
		System.out.println("Inside register service...");
		Users users = new Users();
		users.setFirstName(userInfo.getFirstName());
		users.setLastName(userInfo.getLastName());
		users.setEmail(userInfo.getEmail());
		users.setMobile(userInfo.getMobile());
		users.setPassword(userInfo.getPassword());
		
		
		int userId = userDAO.createUser(users);
		return userId;
		
	}

}
