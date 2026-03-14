package com.kodekart.services;

import com.kodekart.dao.OrderDAO;
import com.kodekart.models.Order;

import java.util.List;

public class OrderServiceAdmin {

    private OrderDAO orderDAO = new OrderDAO();

    public void viewAllOrders() {

        System.out.println("\n===== ALL ORDERS =====");

        List<Order> orders = orderDAO.getAllOrders();

        if (orders.isEmpty()) {
            System.out.println("No orders found!");
            return;
        }

        for (Order o : orders) {
            System.out.println(o);
            System.out.println("--------------------------");
        }
    }
}
