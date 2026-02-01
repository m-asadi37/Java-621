package pack2;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("aaa", "ssss", 1999);
        b1.printBook();
        b1.borrowBook();
        b1.borrowBook();
        b1.printBook();
        b1.returnBook();
        b1.returnBook();
        b1.printBook();
    }
}
