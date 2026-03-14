package com.kodekart.app;

import com.kodekart.services.UserService;
import com.kodekart.utils.InputUtils;

public class App {

    public static void main(String[] args) {

        UserService userService = new UserService();

        System.out.println("====================================");
        System.out.println("         Welcome to KodeKart");
        System.out.println("====================================");

        boolean running = true;

        while (running) {

            System.out.println("\n===== HOME MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Login (User/Admin)");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = InputUtils.sc.nextInt();
            InputUtils.sc.nextLine();

            switch (choice) {

                case 1:
                    userService.register();
                    break;

                case 2:
                    userService.login();
                    break;

                case 3:
                    System.out.println("\nThank you for using KodeKart!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
