package com.kodekart.dao;

import com.kodekart.database.DatabaseConnection;
import com.kodekart.models.CartItem;

import java.sql.*;
import java.util.*;

public class CartDAO {

    public boolean addToCart(int userId, int productId, int qty) {

        String sql = "INSERT INTO cart(user_id,product_id,quantity) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.setInt(3, qty);

            return ps.executeUpdate() > 0;

        } catch (Exception e) { e.printStackTrace(); }

        return false;
    }

    public List<CartItem> getCartItems(int userId) {

        List<CartItem> items = new ArrayList<>();

        String sql = "SELECT * FROM cart WHERE user_id=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CartItem c = new CartItem();
                c.setId(rs.getInt("id"));
                c.setUserId(userId);
                c.setProductId(rs.getInt("product_id"));
                c.setQuantity(rs.getInt("quantity"));
                items.add(c);
            }

        } catch (Exception e) { e.printStackTrace(); }

        return items;
    }

    public boolean removeFromCart(int userId, int productId) {

        String sql = "DELETE FROM cart WHERE user_id=? AND product_id=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ps.setInt(2, productId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) { e.printStackTrace(); }

        return false;
    }

    public void clearCart(int userId) {

        String sql = "DELETE FROM cart WHERE user_id=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (Exception e) { e.printStackTrace(); }
    }
}
