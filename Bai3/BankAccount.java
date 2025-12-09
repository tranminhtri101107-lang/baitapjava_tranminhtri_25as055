package Bai3;

import java.util.UUID;

public abstract class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // Tạo số tài khoản ngẫu nhiên
    private String generateAccountNumber() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    // Nạp tiền (chung cho mọi loại tài khoản)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful: +" + amount);
        } else {
            System.out.println("Amount must be positive!");
        }
    }

    // Rút tiền - có điều kiện riêng ở lớp con
    public abstract boolean withdraw(double amount);

    // Hiển thị thông tin tài khoản (trừu tượng)
    public abstract void showAccountInfo();

    // Getter & Setter

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}