package OOPs.Module3.Part3.Task3.Library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    public String getName() {
        return name;
    }
}


