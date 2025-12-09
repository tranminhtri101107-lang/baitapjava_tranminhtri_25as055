package Bai3;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.035; // 3.5%/năm

    public SavingsAccount(String ownerName) {
        super(ownerName);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải là số dương!");
            return false;
        }
        if (getBalance() < 100_000) {
            System.out.println("Không thể rút: Số dư tối thiểu yêu cầu là 100.000 VND");
            return false;
        }
        if (amount > getBalance()) {
            System.out.println("Số dư không đủ!");
            return false;
        }
        setBalance(getBalance() - amount);
        System.out.println("Rút tiền thành công: - " + amount);
        return true;
    }

    @Override
    public void showAccountInfo() {
        System.out.printf("Savings Account | Number: %s | Owner: %s | Balance: %.2f VND | Interest: %.2f%%\n",
                getAccountNumber(), getOwnerName(), getBalance(), interestRate * 100);
    }
}