package com.flipkart.versoning.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.flipkart.versoning.response.ErrorResponse;

@RestControllerAdvice
public class FlipkartExceptionHandler {
	
	@ExceptionHandler(PaymentFailedException.class)
	public ResponseEntity<ErrorResponse> handlePaymentFailedException(PaymentFailedException ex) {
		
		ErrorResponse errorResponse = new  ErrorResponse();
		errorResponse .setErrorCode("PMT - 000");
		errorResponse.setErrorMessage(ex.getMessage());
		return ResponseEntity.ok(errorResponse) ;
		
	}

	
}
