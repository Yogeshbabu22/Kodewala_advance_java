package com.flipkart.versoning.request;

public class PaymentInfo {
	
 private int paymentId;
 private String itemName;
 private String status;
 private String address;
 private String totalAmount;
 public int getPaymentId() {
	return paymentId;
}
 public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
 }
 public String getItemName() {
	return itemName;
 }
 public void setItemName(String itemName) {
	this.itemName = itemName;
 }
 public String getStatus() {
	return status;
 }
 public void setStatus(String status) {
	this.status = status;
 }
 public String getAddress() {
	return address;
 }
 public void setAddress(String address) {
	this.address = address;
 }
 public String getTotalAmount() {
	return totalAmount;
 }
 public void setTotalAmount(String totalAmount) {
	this.totalAmount = totalAmount;
 }


}
