package com.zepto.payment.exception;

public class PaymentFailedException extends RuntimeException
{
	public PaymentFailedException(String msg)
	{
		super(msg);
	}
}
