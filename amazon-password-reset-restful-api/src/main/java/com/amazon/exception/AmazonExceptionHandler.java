package com.amazon.exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.amazon.response.ErrorResponse;

@RestControllerAdvice
public class AmazonExceptionHandler 
{
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> handleUniqueEmailException(ConstraintViolationException ex)
	{
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("REG-001");
		errorResponse.setErrorMessage("Duplicate Email id...");
		
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(PassowordResetFailException.class)
	public ResponseEntity<ErrorResponse> handleResetPasswordException(PassowordResetFailException ex)
	{
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("PSW-002");
		errorResponse.setErrorMessage(ex.getMessage());
		
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(EmailNotExistException.class)
	public ResponseEntity<ErrorResponse> handleEmailDoesNotExistsException(EmailNotExistException ex)
	{
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("EID-005");
		errorResponse.setErrorMessage(ex.getMessage());
		
		return ResponseEntity.ok(errorResponse);
	}

}
