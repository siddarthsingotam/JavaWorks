package OOPs.Module3.Part3.Task3.Library.system;

import OOPs.Module3.Part3.Task3.Library.model.Book;
import OOPs.Module3.Part3.Task3.Library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Library member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book)) {
            // Implement borrow logic
            System.out.println(member.getName() + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Invalid member or book.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book)) {
            // Implement return logic
            System.out.println(member.getName() + " returned the book: " + book.getTitle());
        } else {
            System.out.println("Invalid member or book.");
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

