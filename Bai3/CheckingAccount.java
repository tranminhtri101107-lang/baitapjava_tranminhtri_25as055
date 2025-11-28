package Bai3;

public class CheckingAccount extends  BankAccount {
    public CheckingAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Rút thành công " + amount);
            return true;
        } else {
            System.out.println("Giao dịch thất bại! Số dư không đủ hoặc số tiền không hợp lệ.");
            return false;
        }
    }

    @Override
    public void showAccountInfo() {

    }
}
