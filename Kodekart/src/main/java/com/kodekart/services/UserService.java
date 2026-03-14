package com.kodekart.services;

import com.kodekart.dao.UserDAO;
import com.kodekart.models.User;
import com.kodekart.utils.InputUtils;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    // REGISTER USER
    public void register() {
        System.out.println("\n===== USER REGISTRATION =====");

        System.out.print("Enter Name: ");
        String name = InputUtils.sc.nextLine();

        System.out.print("Enter Email: ");
        String email = InputUtils.sc.nextLine();

        if (userDAO.emailExists(email)) {
            System.out.println("❌ Email already exists!");
            return;
        }

        System.out.print("Enter Phone: ");
        String phone = InputUtils.sc.nextLine();

        System.out.print("Enter Password: ");
        String password = InputUtils.sc.nextLine();

        User user = new User(name, email, phone, password);

        if (userDAO.registerUser(user))
            System.out.println("✅ Registration Successful!");
        else
            System.out.println("❌ Registration Failed.");
    }

    // LOGIN USER / ADMIN
    public void login() {

        System.out.println("\n===== LOGIN TYPE =====");
        System.out.println("1. User Login");
        System.out.println("2. Admin Login");
        System.out.print("Choose: ");

        int choice = InputUtils.sc.nextInt();
        InputUtils.sc.nextLine();

        System.out.print("Enter Email: ");
        String email = InputUtils.sc.nextLine();

        System.out.print("Enter Password: ");
        String password = InputUtils.sc.nextLine();

        // ADMIN LOGIN
        if (choice == 2) {
            if (email.equals("admin@kodekart.com") && password.equals("admin")) {
                System.out.println("\n✔ Admin login successful!");
                new AdminService().adminMenu();
            } else {
                System.out.println("❌ Invalid admin credentials!");
            }
            return;
        }

        // USER LOGIN
        User user = userDAO.login(email, password);
        if (user == null) {
            System.out.println("❌ Invalid email or password");
            return;
        }

        System.out.println("\n✔ Login successful! Welcome " + user.getName());
        new UserMenuService(user).showMenu();
    }
}
