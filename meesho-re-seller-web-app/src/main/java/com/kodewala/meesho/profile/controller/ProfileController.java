package com.kodewala.meesho.profile.controller;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodewala.meesho.bean.UserProfile;
import com.kodewala.meesho.hibernate.config.ConnectHibernate;



@Controller
public class ProfileController {
	
    List<UserProfile> al;
	@RequestMapping("/showProfilePage")
	public String showProfilePage() {
		return "Profile";
	}
	
	@PostMapping("/createProfile")
	public String createReSellerProfile(@ModelAttribute UserProfile userProfile) {
		
		ConnectHibernate connectHibernate = new ConnectHibernate();
		Session session=connectHibernate.getHibernateConnection();
		Transaction transaction =session.beginTransaction();
		session.save(userProfile);
		
		transaction.commit();
		al = new ArrayList<UserProfile>();
		al.add(userProfile);
		System.out.println(al);
		return "Profile-success";
		
		
	}
	
	@GetMapping("/showLoginPage")
	public String showLoginPage() {
		return"Login";
		
	}
	@PostMapping("/validateLogin")
	public String validateLogin(@RequestParam("email") String email, @RequestParam("password") String password) {
		System.out.println(email);
		System.out.println(password);
		
		boolean result = validateUser(email, password);
		if(result) {
			return "meesho-re-seller-home";
		}else {
			System.out.println("login Fail");
			return "login-fail";
		}
		
		
	}
	public boolean validateUser(String email, String password) {
	
		UserProfile userProfile = al.get(0);
		String dbEmail = userProfile.getEmail();
		String dbPassword = userProfile.getPassword();
		if(dbEmail.equals(email) && dbPassword.equals(password)) {
			return true;
		}else {
			return false;
		}
		
	}


}
