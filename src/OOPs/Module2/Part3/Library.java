package OOPs.Module2.Part3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + book.getTitle() +
                    "\", Author: \"" + book.getAuthor() +
                    "\", Year: " + book.getPublicationYear());
        }
    }

    // Find books by a specific author and display the results
    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() +
                        "\", Year: " + book.getPublicationYear());
            }
        }
    }

    // Borrow a book from the library
    public void borrowBook(String title) {
        Book bookToBorrow = findBookByTitle(title);

        if (bookToBorrow != null) {
            books.remove(bookToBorrow);
            System.out.println("Book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is not available in the library.");
        }
    }

    // Return a book to the library
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" has been returned.");
    }

    // Find a book by title
    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Check the availability of a specific book by its title
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true; // Book is available
            }
        }
        return false; // Book is not available
    }
}
