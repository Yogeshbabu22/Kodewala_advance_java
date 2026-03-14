package com.kodekart.models;

public class CartItem {

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

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int id;
    private int userId;
    private int productId;
    private int quantity;

    // getters & setters

    @Override
    public String toString() {
        return "Product ID: " + productId + " | Qty: " + quantity;
    }
}
