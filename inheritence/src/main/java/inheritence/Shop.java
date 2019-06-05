package inheritence;

import java.util.LinkedList;

public class Shop implements Reviewables {

    private String name;
    private int rating;
    private String priceCat;
    private LinkedList<Review> reviews;

    public Shop(String name, int rating, String priceCat, LinkedList<Review> review) {
        this.name = name;
        this.rating = rating;
        this.priceCat = priceCat;
        this.reviews = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(String priceCat) {
        this.priceCat = priceCat;
    }

    public LinkedList<Review> getReview() {
        return reviews;
    }

    public void setReview(LinkedList<Review> review) {
        this.reviews = review;
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
        return String.format("%s Grocery/Shop has a %d star rating and is %s expensive", this.getName(), this.getRating(), this.getPriceCat());
    }
}
