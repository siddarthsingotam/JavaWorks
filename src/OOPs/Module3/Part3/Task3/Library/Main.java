package OOPs.Module3.Part3.Task3.Library;

import OOPs.Module3.Part3.Task3.Library.model.Book;
import OOPs.Module3.Part3.Task3.Library.model.LibraryMember;
import OOPs.Module3.Part3.Task3.Library.system.Library;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        Library library = new Library();

        Book book1 = new Book("F1 racers", "J.D. Salinger", "123456");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "789012");

        LibraryMember member1 = new LibraryMember("Siddarth Singotam", 1);
        LibraryMember member2 = new LibraryMember("Roberto Mendez", 2);

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        // Perform borrowing, returning, reserving, and canceling operations
        library.borrowBook(member1, book1);
        library.returnBook(member1, book1);
        library.reserveBook(member1, book1);
        library.displayReservedBooks(member1);
        library.cancelReservation(member1, book1);
    }
}

