package OOPs.Module3.Part3.Task2.Library.system;

import OOPs.Module3.Part3.Task2.Library.model.Book;
import OOPs.Module3.Part3.Task2.Library.model.LibraryMember;


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
}

