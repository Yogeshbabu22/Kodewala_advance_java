package com.kodekart.services;

import com.kodekart.dao.ProductDAO;
import com.kodekart.models.Product;
import com.kodekart.utils.InputUtils;

import java.util.List;

public class ProductService {

    private ProductDAO productDAO = new ProductDAO();

    public void addProduct() {

        System.out.println("\n===== ADD PRODUCT =====");

        System.out.print("Enter Name: ");
        String name = InputUtils.sc.nextLine();

        System.out.print("Enter Category: ");
        String category = InputUtils.sc.nextLine();

        System.out.print("Enter Price: ");
        double price = InputUtils.sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = InputUtils.sc.nextInt();
        InputUtils.sc.nextLine();

        System.out.print("Enter Description: ");
        String desc = InputUtils.sc.nextLine();

        Product product = new Product(name, category, price, qty, desc);

        if (productDAO.addProduct(product))
            System.out.println("✔ Product added!");
        else
            System.out.println("❌ Failed to add product.");
    }

    public void updateProduct() {

        System.out.print("Enter Product ID to Update: ");
        int id = InputUtils.sc.nextInt();
        InputUtils.sc.nextLine();

        Product p = productDAO.getProductById(id);

        if (p == null) {
            System.out.println("❌ Product not found.");
            return;
        }

        System.out.print("New Price: ");
        p.setPrice(InputUtils.sc.nextDouble());

        System.out.print("New Quantity: ");
        p.setQuantity(InputUtils.sc.nextInt());
        InputUtils.sc.nextLine();

        System.out.print("New Description: ");
        p.setDescription(InputUtils.sc.nextLine());

        if (productDAO.updateProduct(p))
            System.out.println("✔ Product updated!");
        else
            System.out.println("❌ Update failed.");
    }

    public void deleteProduct(int id) {
        if (productDAO.deleteProduct(id))
            System.out.println("✔ Product deleted!");
        else
            System.out.println("❌ Product not found.");
    }

    public void viewAllProducts() {
        List<Product> products = productDAO.getAllProducts();

        System.out.println("\n===== ALL PRODUCTS =====");
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
            System.out.println("------------------------------");
        }
    }

    public void searchProduct(String keyword) {
        List<Product> results = productDAO.searchProduct(keyword);

        System.out.println("\n===== SEARCH RESULTS =====");
        if (results.isEmpty()) {
            System.out.println("No matching products found!");
            return;
        }

        for (Product p : results) {
            System.out.println(p);
            System.out.println("------------------------------");
        }
    }
}
