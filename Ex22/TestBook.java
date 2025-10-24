package Ex22;

public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("Jane Austen", "jane.austen@example.com", 'F');
        Author author2 = new Author("Charles Dickens", "charles.dickens@example.com", 'M');

        Author[] authors = {author1, author2};

        Book book = new Book("Great Authors Collection", authors, 29.99, 10);

        System.out.println(book.toString());

        System.out.println("Authors: " + book.getAuthorNames());

        for (Author author : book.getAuthors()) {
            System.out.println(author.toString());
        }
        book.setPrice(24.99);
        book.setQty(15);
        System.out.println("Updated Book: " + book.toString());
    }
}
