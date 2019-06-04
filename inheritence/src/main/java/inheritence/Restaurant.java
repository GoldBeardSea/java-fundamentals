/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritence;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private int rating;
    private String priceCat;
    private ArrayList<Review> reviews;

    public Restaurant(String name, int rating, String priceCat) {
        this.name = name;
        this.rating = rating;
        this.priceCat = priceCat;
        this.reviews = new ArrayList<>();
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

    public void addReview(Review review) {
        if (review.getRestaurant() == this.getName()) {
            reviews.add(review);
            int newRating = review.getRating();
            for (Review list: reviews) {
                newRating = newRating + list.getRating();
            }
            this.rating = newRating / (reviews.size() + 1);
        } else {
            System.out.println("Restaurant names do not match");
        }
    }

    public String toString() {
        return String.format("%s has a %d star rating and is %s expensive", this.getName(), this.getRating(), this.getPriceCat());
    }

}

