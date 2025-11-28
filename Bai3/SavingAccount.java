package Bai3;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        // Logic: Số dư < 100k không cho rút HOẶC rút quá số dư thì báo lỗi
        if (getBalance() < 100000) {
            System.out.println("Không thể rút! Số dư tài khoản tiết kiệm thấp hơn 100,000.");
        } return false;
    }

    @Override
    public void showAccountInfo() {
        System.out.println("[Savings Account] Số TK: " + getAccountNumber() +
                " | Chủ TK: " + getOwnerName() +
                " | Số dư: " + getBalance() +
                " | Lãi suất: " + interestRate);
    }
}
