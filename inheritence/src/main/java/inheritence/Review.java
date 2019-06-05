package inheritence;

public class Review {

    private String body;
    private String author;
    private int rating;
    private Reviewables reviewableObj;

    public Review(String body, String author, int rating, Reviewables reviewable) {
        this.body = body;
        this.author = author;
        this.rating = rating;
        this.reviewableObj = reviewable;
        reviewable.addReview(this);
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

    public Reviewables getReviewable() {
        return reviewableObj;
    }

    public void setReviewable(Reviewables reviewable) {
        this.reviewableObj = reviewable;
    }

    public String toString() {
        return String.format("%s. Restaurant: %s with a %d star rating from author %s", this.getBody(), this.getReviewable(), this.getRating(), this.getAuthor());
    }
}
