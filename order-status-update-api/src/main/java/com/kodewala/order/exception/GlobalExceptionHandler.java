package com.kodewala.order.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.order.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(InvalidIdException.class)
	public ResponseEntity<ErrorResponse> handleInvalidIdException(InvalidIdException ex)
	{
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("IID-102");
		errorResponse.setErrorMessage(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}

}
