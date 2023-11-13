package OOPs.Module2.Part3;

public class LibraryMain {
    public static void main(String[] args) {
        // Create instances of Book representing different books
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Create an instance of Library
        Library library = new Library();

        // Add the book instances to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display the list of all books in the library
        library.displayBooks();

        // Search for books by a specific author and display the results
        library.findBooksByAuthor("Jane Doe");

        // Borrow a book
        library.borrowBook("Introduction to Java Programming");
        library.displayBooks();

        // Return a book
        Book returnedBook = new Book("Introduction to Java Programming", "John Smith", 2020);
        library.returnBook(returnedBook);
        library.displayBooks();
    }
}
