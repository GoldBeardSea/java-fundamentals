package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater testTheater;
    Review reviewWithString;
    Review reviewNoString;

    @Before
    public void initialized() {
        testTheater = new Theater("Northgate Plex", 5, "$$$");
        reviewNoString = new Review("This is a rating without movie", "the", 5, testTheater);
        reviewWithString = new Review("This is a rating with movie", "bill", 5, testTheater, "The Oldest Man");

    }
    @Test
    public void addMovie() {
        testTheater.addMovie("The Older Yeller");
        testTheater.getMovies().size();
        assertEquals(1, testTheater.getMovies().size());
    }

    @Test
    public void removeMovie() {
        testTheater.addMovie("The Blue Bandit");
        testTheater.addMovie("The Oldest Yeller");
        testTheater.addMovie("The Oldest Man");
        testTheater.removeMovie("The Oldest Man");
        assertEquals(2, testTheater.getMovies().size());
    }

    @Test
    public void addReview_test_noString() {
        testTheater.addReview(reviewNoString);
        testTheater.addReview(reviewWithString);
        //test is failing
        System.out.println(testTheater.getReviews());
    }

    @Test
    public void toString1() {
    }
}