package inheritence;

import java.util.LinkedList;

public class Theater {

    private String name;
    private String movies;
    private LinkedList<Review> reviews;

    public Theater(String name, String movies, LinkedList<Review> reviews) {
        this.name = name;
        this.movies = movies;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(LinkedList<Review> reviews) {
        this.reviews = reviews;
    }


}
