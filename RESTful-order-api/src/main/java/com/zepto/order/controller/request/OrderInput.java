package com.zepto.order.controller.request;

import java.util.List;

public class OrderInput {
	private String orderId;
	private List<ProductInput> products;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<ProductInput> getProducts() {
		return products;
	}
	public void setProducts(List<ProductInput> products) {
		this.products = products;
	}
	

}
