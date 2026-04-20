/*
Q16 Design a Library Management System to automate book issuing and returning.
• Add a new book to the library.
• Search a book by ID or title.
• Issue a book to a user.
• Return a book.
• Maintain book availability status.

continue till 20
*/

import java.util.*;

// Book class
class Book {

    int id;
    String name;
    boolean issued = false; // track availability

    // constructor to initialize values
    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// main class
public class LibrarySystem {

    static List<Book> list = new ArrayList<>(); // store books

    public static void main(String[] args) {

        // add book
        list.add(new Book(1, "Java"));

        // issue book
        issue(1);

        // return book
        returnBook(1);
    }

    // method to issue book
    static void issue(int id) {
        for (Book b : list) {
            if (b.id == id && !b.issued) {
                b.issued = true; // mark issued
                System.out.println("Book Issued");
            }
        }
    }

    // method to return book
    static void returnBook(int id) {
        for (Book b : list) {
            if (b.id == id) {
                b.issued = false; // mark available
                System.out.println("Book Returned");
            }
        }
    }
}