package Ex25;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString(){
        return "Customer :" + id + "\nName: " + name;
    }
}
