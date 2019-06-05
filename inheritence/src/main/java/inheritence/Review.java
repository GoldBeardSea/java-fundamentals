package inheritence;

public class Review {

    private String body;
    private String author;
    private int rating;
    private Reviewables reviewableObj;
    private String movie;

    public Review(String body, String author, int rating, Reviewables reviewable) {
        this.body = body;
        this.author = author;
        this.rating = rating;
        this.reviewableObj = reviewable;
        reviewable.addReview(this);
    }

    public Review(String body, String author, int rating, Reviewables reviewableObj, String movie) {
        this.body = body;
        this.author = author;
        this.rating = rating;
        this.reviewableObj = reviewableObj;
        this.movie = movie;
        reviewableObj.addReview(this);
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

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String toString() {
        return String.format("%s. %s with a %d star rating from author %s", this.getBody(), this.getReviewable(), this.getRating(), this.getAuthor());
    }
}
