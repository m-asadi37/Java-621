package pack2;

public class Book {

    String title;
    String author;
    int publicYear;
    boolean isAvailable;

    Book(String title, String author, int publicYear) {
        this.title = title;
        this.author = author;
        this.publicYear = publicYear;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Borrowed...");
        } else {
            System.out.println("Book Not Available...");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book Returned...");
        } else {
            System.out.println("Book Exists...");
        }
    }

    void printBook() {
        System.out.printf("Title: %s - Author: %s - Public Year: %d - Available Books: %s%n",
                title, author, publicYear, isAvailable);
    }
}
