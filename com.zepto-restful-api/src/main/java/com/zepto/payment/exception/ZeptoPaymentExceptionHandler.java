package com.zepto.payment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zepto.payment.response.ErrorrMessage;
@RestControllerAdvice
public class ZeptoPaymentExceptionHandler {
	@ExceptionHandler(PaymentFailedException.class)
	public ResponseEntity<ErrorrMessage> handleException(PaymentFailedException ex) {
		ErrorrMessage errorMessage = new ErrorrMessage();
		errorMessage.setError(ex.getMessage());
		errorMessage.setMessageCode("PAY-001");
		return ResponseEntity.ok(errorMessage);
	}

}
