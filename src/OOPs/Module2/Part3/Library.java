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

    // Calculate and return the average rating of all books in the library
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            System.out.println("No books available to calculate average rating.");
            return 0.0;
        }

        double totalRating = 0;
        for (Book book : books) {
            totalRating += book.getRating();
        }

        return totalRating / books.size();
    }

    // Return the book with the highest number of reviews
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            System.out.println("No books available to determine the most reviewed book.");
            return null;
        }

        Book mostReviewedBook = books.get(0);
        int maxReviews = mostReviewedBook.getReviews().size();

        for (Book book : books) {
            int currentReviews = book.getReviews().size();
            if (currentReviews > maxReviews) {
                mostReviewedBook = book;
                maxReviews = currentReviews;
            }
        }

        return mostReviewedBook;
    }
}
