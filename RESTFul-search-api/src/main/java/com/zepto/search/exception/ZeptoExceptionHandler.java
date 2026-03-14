package com.zepto.search.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zepto.search.response.ErrorResponse;

@RestControllerAdvice
public class ZeptoExceptionHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorResponse>handleException(ProductNotFoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("ZEP - 001");
		return ResponseEntity.ok(errorResponse);
		
	}

}
