package com.amazon.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.request.ResetPassword;
import com.amazon.service.ResetPasswordServiceImple;

@RestController
public class PasswordManagementController {
	
	@Autowired
	ResetPasswordServiceImple resetPasswordService;
	@PostMapping("resetPassword")
	public ResponseEntity resetPassword(@RequestBody ResetPassword resetPassword) {
		
		
		String result = resetPasswordService.resetPassService(resetPassword);
		System.out.println(resetPassword.getEmailId());
	
		return ResponseEntity.ok(result);
	}

	
}
