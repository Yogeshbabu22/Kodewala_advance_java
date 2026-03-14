package com.amazon.service;

import org.springframework.stereotype.Service;

import com.amazon.request.ResetPassword;

@Service
public interface ResetPasswordService {

	String resetPassword(ResetPassword resetPassword);
}
