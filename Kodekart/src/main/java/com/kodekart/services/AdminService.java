package com.kodekart.services;

import com.kodekart.utils.InputUtils;

public class AdminService {

    private ProductService productService = new ProductService();
    private OrderServiceAdmin orderServiceAdmin = new OrderServiceAdmin();

    public void adminMenu() {

        boolean running = true;

        while (running) {

            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. View All Orders");
            System.out.println("6. Logout");
            System.out.print("Choose: ");

            int choice = InputUtils.sc.nextInt();
            InputUtils.sc.nextLine();

            switch (choice) {

                case 1:
                    productService.addProduct();
                    break;

                case 2:
                    productService.updateProduct();
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int id = InputUtils.sc.nextInt();
                    productService.deleteProduct(id);
                    break;

                case 4:
                    productService.viewAllProducts();
                    break;

                case 5:
                    orderServiceAdmin.viewAllOrders();
                    break;

                case 6:
                    System.out.println("✔ Admin logged out!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid option!");
            }
        }
    }
}
