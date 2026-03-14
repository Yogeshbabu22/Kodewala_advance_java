package com.kodekart.services;

import com.kodekart.dao.*;
import com.kodekart.models.*;

import java.util.*;

public class OrderService {

    private int userId;

    private CartDAO cartDAO = new CartDAO();
    private ProductDAO productDAO = new ProductDAO();
    private OrderDAO orderDAO = new OrderDAO();
    private OrderItemDAO orderItemDAO = new OrderItemDAO();

    public OrderService(int userId) {
        this.userId = userId;
    }

    public void placeOrder() {

        List<CartItem> cartItems = cartDAO.getCartItems(userId);

        if (cartItems.isEmpty()) {
            System.out.println("❌ Cart is empty!");
            return;
        }

        double total = 0;

        for (CartItem c : cartItems) {
            Product p = productDAO.getProductById(c.getProductId());
            if (p != null)
                total += p.getPrice() * c.getQuantity();
        }

        Order order = new Order(userId, new Date(), total);

        int orderId = orderDAO.createOrder(order);
        if (orderId == -1) {
            System.out.println("❌ Failed to place order!");
            return;
        }

        for (CartItem c : cartItems) {

            Product p = productDAO.getProductById(c.getProductId());

            OrderItem item = new OrderItem(orderId, c.getProductId(),
                                           c.getQuantity(),
                                           p.getPrice());

            orderItemDAO.addOrderItem(item);

            productDAO.reduceStock(c.getProductId(), c.getQuantity());
        }

        cartDAO.clearCart(userId);

        System.out.println("✔ Order placed successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + total);
    }

    public void viewOrderHistory() {

        List<Order> orders = orderDAO.getUserOrders(userId);

        System.out.println("\n===== ORDER HISTORY =====");

        if (orders.isEmpty()) {
            System.out.println("No orders yet!");
            return;
        }

        for (Order o : orders) {
            System.out.println(o);
            System.out.println("--------------------------");
        }
    }
}
