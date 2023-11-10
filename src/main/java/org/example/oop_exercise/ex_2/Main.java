package main.java.org.example.oop_exercise.ex_2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978 - 3 - 16 - 148410 - 0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "978 - 0 - 06 - 112008 - 4");
        Book book3 = new Book("1984", "George Orwell", 1949, "978 - 0 - 452 - 28423 - 4");

        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);

        System.out.println("Books in the library:");
        library.displayBooks();

        library.removeBookByISBN("978 - 0 - 06 - 112008 - 4");

        System.out.println("\nAfter removing a book:");
        library.displayBooks();
    }
}

