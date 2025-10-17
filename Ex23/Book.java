package Ex23;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = qty;
    }
    public String getIsbn() {
        return isbn;
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
    public void  setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return quantity;
    }
    public void setQty(int qty) {
        this.quantity = qty;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String toString() {
        return "Ex23.Book: " + isbn + "\nEx23.Author: " + name + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}
