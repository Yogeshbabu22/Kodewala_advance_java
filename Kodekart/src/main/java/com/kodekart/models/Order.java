package com.kodekart.models;

import java.util.Date;

public class Order {

    private int id;
    private int userId;
    private Date orderDate;
    private double totalAmount;

    public Order() {}

    public Order(int userId, Date date, double amount) {
        this.userId = userId;
        this.orderDate = date;
        this.totalAmount = amount;
    }

    // getters & setters

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
    public String toString() {
        return "Order ID: " + id +
               "\nDate: " + orderDate +
               "\nTotal: " + totalAmount;
    }
}
