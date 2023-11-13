package OOPs.Module2.Part3;

public class LibraryMain {
    public static void main(String[] args) {
        // Create instances of Book representing different books
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Create instances of User representing library users
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);


        // Create an instance of Library
        Library library = new Library();

        // Add the book instances to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Add users to the library
        library.addUser(user1);
        library.addUser(user2);

        // Display all users in the library
        library.displayUsers();
        System.out.println();

        // Display the list of all books in the library
        library.displayBooks();
        System.out.println();

        // Search for books by a specific author and display the results
        library.findBooksByAuthor("Jane Doe");

        System.out.println();
        // Borrow a book
        library.borrowBook("Introduction to Java Programming");
        library.displayBooks();

        // Return a book
        Book returnedBook = new Book("Introduction to Java Programming", "John Smith", 2020);
        library.returnBook(returnedBook);
        library.displayBooks();


        System.out.println();
        // Check book availability
        String bookTitleToCheck = "Data Structures and Algorithms";
        boolean isAvailable = library.isBookAvailable(bookTitleToCheck);

        if (isAvailable) {
            System.out.println("Book \"" + bookTitleToCheck + "\" is available in the library.");
        } else {
            System.out.println("Book \"" + bookTitleToCheck + "\" is not available in the library.");
        }
        System.out.println();

        // Set rating and add reviews to a book
        Book bookToReview = new Book("Introduction to Java Programming", "John Smith", 2020);
        bookToReview.setRating(4.5);
        bookToReview.addReview("Great book for beginners!");
        bookToReview.addReview("The examples are very helpful.");

        // Display book details with rating and reviews
        bookToReview.displayBookDetails();

        System.out.println();

        // Display library statistics
        System.out.println("Average Book Rating: " + library.getAverageBookRating());

        Book mostReviewedBook = library.getMostReviewedBook();
        if (mostReviewedBook != null) {
            System.out.println("Most Reviewed Book: " + mostReviewedBook.getTitle());
        }

        // User borrows a book
        user1.borrowBook(book1);

        // Display all users and their borrowed books again
        library.displayUsers();

        // User returns a book
        user1.returnBook(book1);

        // Display all users and their borrowed books again
        library.displayUsers();
    }
}

