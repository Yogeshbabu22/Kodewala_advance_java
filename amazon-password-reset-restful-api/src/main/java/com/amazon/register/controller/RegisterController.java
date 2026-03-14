package com.amazon.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.request.UserInfo;
import com.amazon.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	RegisterService registerService;
	
	@PostMapping("register")
	public ResponseEntity registerUser(@RequestBody UserInfo userInfo) {
		System.out.println("Insisde RegsiterController......");
		
		
		System.out.println("UserInfo : "+ userInfo.getFirstName() + " " + userInfo.getEmail());
		
		int userId = registerService.registerUserService(userInfo);
	
		
		
		
		
		
		return ResponseEntity .ok("Register Succes:"+userId);
	}
	
	

}
