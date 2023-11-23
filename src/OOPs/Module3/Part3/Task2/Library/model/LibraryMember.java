package OOPs.Module3.Part3.Task2.Library.model;

public class LibraryMember {
    private String name;
    private int memberId;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}

