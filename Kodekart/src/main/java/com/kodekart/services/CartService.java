package com.kodekart.services;

import com.kodekart.dao.CartDAO;
import com.kodekart.models.CartItem;

import java.util.List;

public class CartService {

    private int userId;
    private CartDAO cartDAO = new CartDAO();

    public CartService(int userId) {
        this.userId = userId;
    }

    public void addToCart(int productId, int quantity) {
        if (cartDAO.addToCart(userId, productId, quantity))
            System.out.println("✔ Added to cart!");
        else
            System.out.println("❌ Failed to add to cart.");
    }

    public void viewCart() {

        List<CartItem> items = cartDAO.getCartItems(userId);

        System.out.println("\n===== YOUR CART =====");
        if (items.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        for (CartItem item : items) {
            System.out.println(item);
            System.out.println("---------------------");
        }
    }

    public void removeFromCart(int productId) {
        if (cartDAO.removeFromCart(userId, productId))
            System.out.println("✔ Removed from cart!");
        else
            System.out.println("❌ Item not found!");
    }
}
