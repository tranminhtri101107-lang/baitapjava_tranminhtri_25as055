public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String a102, String kumar) {
    }

    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit (int amount) {
        return balance + amount;
    }
    public int debit (int amount) {
        return balance - amount;
    }
    public int transferTo (int amount) {
        return balance - amount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}