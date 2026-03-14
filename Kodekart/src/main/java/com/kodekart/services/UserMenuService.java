package com.kodekart.services;

import com.kodekart.models.User;
import com.kodekart.utils.InputUtils;

public class UserMenuService {

    private User user;
    private ProductService productService = new ProductService();
    private CartService cartService;
    private OrderService orderService;

    public UserMenuService(User user) {
        this.user = user;
        this.cartService = new CartService(user.getId());
        this.orderService = new OrderService(user.getId());
    }

    public void showMenu() {

        boolean running = true;

        while (running) {

            System.out.println("\n===== USER MENU =====");
            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Remove from Cart");
            System.out.println("6. Place Order");
            System.out.println("7. View Order History");
            System.out.println("8. Logout");
            System.out.print("Choose: ");

            int choice = InputUtils.sc.nextInt();
            InputUtils.sc.nextLine();

            switch (choice) {

                case 1:
                    productService.viewAllProducts();
                    break;

                case 2:
                    System.out.print("Enter name/category: ");
                    String keyword = InputUtils.sc.nextLine();
                    productService.searchProduct(keyword);
                    break;

                case 3:
                    System.out.print("Product ID: ");
                    int pid = InputUtils.sc.nextInt();
                    System.out.print("Quantity: ");
                    int qty = InputUtils.sc.nextInt();
                    cartService.addToCart(pid, qty);
                    break;

                case 4:
                    cartService.viewCart();
                    break;

                case 5:
                    System.out.print("Enter Product ID to remove: ");
                    int id = InputUtils.sc.nextInt();
                    cartService.removeFromCart(id);
                    break;

                case 6:
                    orderService.placeOrder();
                    break;

                case 7:
                    orderService.viewOrderHistory();
                    break;

                case 8:
                    System.out.println("✔ Logged out!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid option!");
            }
        }
    }
}
