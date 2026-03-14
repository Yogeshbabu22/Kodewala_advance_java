package com.ecom.order.request;

public class PaymentRequest {
	private int ordrId;
	private double  amount;
	private String status;
	
	public int getOrdrId() {
		return ordrId;
	}
	public void setOrdrId(int ordrId) {
		this.ordrId = ordrId;
	}
	public double getAmout() {
		return amount;
	}
	public void setAmout(double amout) {
		this.amount = amout;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
