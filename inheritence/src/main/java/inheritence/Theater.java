package inheritence;

import java.util.HashSet;
import java.util.LinkedList;

public class Theater implements Reviewables {

    private String name;
    private int rating;
    private String priceCat;
    private HashSet<String> movies;
    private LinkedList<Review> reviews;


    public Theater(String name, int rating, String priceCat) {
        this.name = name;
        this.rating = rating;
        this.priceCat = priceCat;
        this.reviews = new LinkedList<>();
        this.movies = new HashSet<>();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public String getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(String priceCat) {
        this.priceCat = priceCat;
    }


    public HashSet<String> getMovies() {
        return movies;
    }


    public void addReview(Review review) {
        if (review.getReviewable() != this) {
            review.setReviewable(this);
        }
        reviews.add(review);
        int newRating = 0;
        for (Review list: reviews) {
            newRating = newRating + list.getRating();
        }
        this.rating = newRating / (reviews.size());
    }

    public String toString() {
        StringBuilder theBuilder = new StringBuilder();
        for (String movie: movies) {
            String concat = movie + " -> ";
            theBuilder.append(concat);
        }
        return String.format("%s Theater has a %d star rating and is %s expensive, the films current in theater are:  %s", this.getName(), this.getRating(), this.getPriceCat(), theBuilder);
    }

}
