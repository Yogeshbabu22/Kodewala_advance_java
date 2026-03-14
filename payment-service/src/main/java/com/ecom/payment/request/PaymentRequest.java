package com.ecom.payment.request;

public class PaymentRequest {
	
	private int ordrId;
	private int  amount;
	private String status;
	
	public int getOrdrId() {
		return ordrId;
	}
	public void setOrdrId(int ordrId) {
		this.ordrId = ordrId;
	}
	public int getAmout() {
		return amount;
	}
	public void setAmout(int amout) {
		this.amount = amout;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	

}
