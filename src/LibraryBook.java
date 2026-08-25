class LibraryBook {
    final String isbn;
    String title;
    String author;
    double price;

    LibraryBook(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(
                "978-1234567890",
                "Java Programming",
                "James Gosling",
                599
        );

        book.displayBook();
    }
}