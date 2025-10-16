public class Account {
    private String id;
    private String name;
    private int  balance = 0;
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0; // mặc định là 0 nếu không truyền vào
    }

    public int Account(String id,String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        return balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        balance -= amount;
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return  "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
}

