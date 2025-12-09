package Bai3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Transaction {
    private String transactionId;
    private String type; // deposit, withdraw, transfer
    private double amount;
    private String fromAccount;
    private String toAccount;
    private LocalDateTime dateTime;

    public Transaction(String type, double amount, String fromAccount, String toAccount) {
        this.transactionId = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount != null ? fromAccount : "N/A";
        this.toAccount = toAccount != null ? toAccount : "N/A";
        this.dateTime = LocalDateTime.now();
    }

    public void showTransactionInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.printf("ID: %s | Type: %s | Amount: %.2f | From: %s | To: %s | Time: %s\n",
                transactionId, type, amount, fromAccount, toAccount, dateTime.format(fmt));
    }

    public String getTransactionId() { return transactionId; }
    public String getFromAccount() { return fromAccount; }
}
