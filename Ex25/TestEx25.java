package Ex25;

public class TestEx25 {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Minh Tri", 'm');
        Account acc1 = new Account(1001, c1, 500.00);
        Customer c2 = new Customer(201, "Khac Gia", 'm');
        Account acc2 = new Account(2001, c2, 800.00);

        System.out.println(acc1); // Minh Tri(101) balance=$500.00
        System.out.println(acc2); // Khac Gia(201) số dư=$800.00

        acc1.deposit(150.75);
        System.out.println(acc1); // balance=$650.75
        acc2.deposit(150.75);
        System.out.println(acc2); // số dư=950.75

        acc1.withdraw(100);
        System.out.println(acc1); // balance=$550.75
        acc2.withdraw(100);
        System.out.println(acc2); //

        acc1.withdraw(600); // amount withdrawn exceeds the current balance!
        System.out.println(acc1); // balance vẫn = $550.75
    }
}
