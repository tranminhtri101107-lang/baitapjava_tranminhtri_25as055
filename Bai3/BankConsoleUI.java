package Bai3;

import java.util.Scanner;

public class BankConsoleUI {
        private BankSystem bankSystem = new BankSystem();
        private Scanner sc = new Scanner(System.in);

        public void start() {
            boolean running = true;
            while (running) {
                if (!bankSystem.isLoggedIn()) {
                    showMainMenu();
                } else {
                    showLoggedInMenu();
                }

                System.out.print("Choose option: ");
                int choice = Integer.parseInt(sc.nextLine());

                if (!bankSystem.isLoggedIn()) {
                    handleMainMenu(choice);
                } else {
                    handleLoggedInMenu(choice);
                    if (choice == 7) running = false;
                }
            }
            System.out.println("Thank you for using our bank!");
        }

        private void showMainMenu() {
            System.out.println("\n=== BANKING SYSTEM ===");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Select an option: ");
        }

        private void showLoggedInMenu() {
            System.out.println("\n--- Welcome, " + bankSystem.findAccountByNumber(
                    bankSystem.findAccountByNumber("temp") != null ? "" : "") + " ---");
            System.out.println("1. Show account information");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Transaction History");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
        }

        private void handleMainMenu(int choice) {
            switch (choice) {
                case 1 -> bankSystem.createAccount();
                case 2 -> bankSystem.login();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid option!");
            }
        }

        private void handleLoggedInMenu(int choice) {
            switch (choice) {
                case 1 -> bankSystem.deposit();
                case 2 -> bankSystem.withdraw();
                case 3 -> bankSystem.transfer();
                case 4 -> bankSystem.getCurrentAccount().showAccountInfo();
                case 5 -> bankSystem.showTransactionHistory();
                case 6 -> bankSystem.logout();
                case 7 -> {}
                default -> System.out.println("Invalid option!");
            }
        }
    }
