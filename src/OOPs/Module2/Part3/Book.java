package OOPs.Module2.Part3;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();


    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        return rating;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Setter method for rating
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please provide a rating between 0 and 5.");
        }
    }

    // Add a review to the book
    public void addReview(String review) {
        reviews.add(review);
    }

    // Display book details, including rating and reviews
    public void displayBookDetails() {
        System.out.println("Title: \"" + title +
                "\", Author: \"" + author +
                "\", Year: " + publicationYear +
                ", Rating: " + rating);

        if (!reviews.isEmpty()) {
            System.out.println("Reviews:");
            for (String review : reviews) {
                System.out.println("- " + review);
            }
        } else {
            System.out.println("No reviews available.");
        }
    }

    // Get the list of reviews
    public ArrayList<String> getReviews() {
        return reviews;
    }
}


