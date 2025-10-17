package Ex21;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return quantity;
    }
    public void setQty(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return "Ex21.Book: " + name + "\nEx21.Author: " + author + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}

