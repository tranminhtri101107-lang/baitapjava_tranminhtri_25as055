package Bai3;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String ownerName) {
        super(ownerName);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
            return false;
        }
        if (amount > getBalance()) {
            System.out.println("Insufficient balance!");
            return false;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrawal successful: -" + amount);
        return true;
    }

    @Override
    public void showAccountInfo() {
        System.out.printf("Checking Account | Number: %s | Owner: %s | Balance: %.2f VND\n",
                getAccountNumber(), getOwnerName(), getBalance());
    }
}
