package library;

public class BookDetails {
    int bookId = 101;
    String title = "Java Programming";
    String author = "Herbert Schildt";
    double price = 450.50;

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}