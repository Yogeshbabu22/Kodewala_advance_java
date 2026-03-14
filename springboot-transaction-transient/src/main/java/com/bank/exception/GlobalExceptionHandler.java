package com.bank.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bank.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidAccountNoException.class)
	public ResponseEntity<ErrorResponse> handleInvalidAccountNoException(InvalidAccountNoException ex)
	{
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("IAC-101");
		errorResponse.setErrorMessage(ex.getMessage());
		
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<ErrorResponse> handleInsufficientBalanceException(InsufficientBalanceException ex)
	{
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("IBA-122");
		errorResponse.setErrorMessage(ex.getMessage());
		
		return ResponseEntity.ok(errorResponse);
	}

}
