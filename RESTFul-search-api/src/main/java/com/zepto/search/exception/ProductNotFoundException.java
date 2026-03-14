package com.zepto.search.exception;

public class ProductNotFoundException extends RuntimeException {
	public ProductNotFoundException(String _message){
		super(_message);
	}

}
