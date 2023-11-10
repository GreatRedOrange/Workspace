package main.java.org.example.oop_exercise.ex_2;


import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> listOfBooks = new ArrayList<>();

    public void addNewBook(Book book) {
        listOfBooks.add(book);
    }

    public void removeBookByISBN(String isbn) {
        Iterator<Book> iterator = listOfBooks.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : listOfBooks) {
            System.out.println(book);
        }
    }
}
