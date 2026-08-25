final class LibraryBookFinal {
    final String bookISBN = "9780135166307";
    String bookTitle = "Java Basics";
    String bookAuthor = "James";

    void displayBook() {
        System.out.println("Book ISBN: " + bookISBN);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Author: " + bookAuthor);
    }
}

public class LibraryFinalDemo {
    public static void main(String[] args) {
        LibraryBookFinal book = new LibraryBookFinal();

        book.displayBook();

    }
}