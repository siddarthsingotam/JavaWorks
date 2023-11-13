package OOPs.Module2.Part3;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " has borrowed the book: \"" + book.getTitle() + "\"");
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(name + " has returned the book: \"" + book.getTitle() + "\"");
        } else {
            System.out.println(name + " did not borrow the book: \"" + book.getTitle() + "\"");
        }
    }
}

