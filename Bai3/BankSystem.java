package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    private BankAccount currentAccount = null;
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();
        System.out.print("Choose account type (1=Savings, 2=Checking): ");
        int choice = Integer.parseInt(sc.nextLine());

        BankAccount acc = choice == 1 ?
                new SavingsAccount(name) : new CheckingAccount(name);

        accounts.add(acc);
        System.out.println("Account created successfully!");
        acc.showAccountInfo();
    }

    public boolean login() {
        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();
        currentAccount = findAccountByNumber(accNum);
        if (currentAccount != null) {
            System.out.println("Login successful!");
            currentAccount.showAccountInfo();
            return true;
        } else {
            System.out.println("Account not found!");
            return false;
        }
    }

    public void deposit() {
        if (currentAccount == null) { System.out.println("Please login first!"); return; }
        System.out.print("Enter deposit amount: ");
        double amount = Double.parseDouble(sc.nextLine());
        currentAccount.deposit(amount);
        transactions.add(new Transaction("deposit", amount, null, currentAccount.getAccountNumber()));
    }

    public void withdraw() {
        if (currentAccount == null) { System.out.println("Please login first!"); return; }
        System.out.print("Enter withdrawal amount: ");
        double amount = Double.parseDouble(sc.nextLine());
        if (currentAccount.withdraw(amount)) {
            transactions.add(new Transaction("withdraw", amount, currentAccount.getAccountNumber(), null));
        }
    }

    public void transfer() {
        if (currentAccount == null) { System.out.println("Please login first!"); return; }
        System.out.print("Enter recipient account number: ");
        String toAccNum = sc.nextLine();
        BankAccount toAcc = findAccountByNumber(toAccNum);
        if (toAcc == null) {
            System.out.println("Recipient account not found!");
            return;
        }
        System.out.print("Enter transfer amount: ");
        double amount = Double.parseDouble(sc.nextLine());

        if (currentAccount.withdraw(amount)) {
            toAcc.deposit(amount);
            transactions.add(new Transaction("transfer", amount, currentAccount.getAccountNumber(), toAccNum));
            System.out.println("Transfer successful!");
        }
    }

    public void showTransactionHistory() {
        if (currentAccount == null) { System.out.println("Please login first!"); return; }
        System.out.println("\n--- Transaction History ---");
        boolean found = false;
        for (Transaction t : transactions) {
            if (t.getFromAccount().equals(currentAccount.getAccountNumber()) ||
                    t.getFromAccount().equals("N/A") && t.getFromAccount().equals(currentAccount.getAccountNumber())) {
                t.showTransactionInfo();
                found = true;
            }
        }
        if (!found) System.out.println("No transactions yet.");
    }

    public BankAccount findAccountByNumber(String accNum) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                return acc;
            }
        }
        return null;
    }

    public BankAccount getCurrentAccount() {
        return currentAccount;
    }

    public boolean isLoggedIn() {
        return currentAccount != null;
    }

    public void logout() {
        currentAccount = null;
        System.out.println("Logged out successfully!");
    }
}