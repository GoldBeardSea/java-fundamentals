package inheritence;

public class Review {

    private String body;
    private String author;
    private int rating;
    private String restaurant;

    public Review(String body, String author, int rating, String restaurant) {
        this.body = body;
        this.author = author;
        this.rating = rating;
        this.restaurant = restaurant;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String toString() {
        return String.format("%s. For %s With %d star rating from %s", this.getBody(), this.getRestaurant(), this.getRating(), this.getAuthor());
    }
}
