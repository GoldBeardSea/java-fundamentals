package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void constructor_author() {
        Review testReview = new Review("Hello", "ODoyle", 2, "This is a name");
        assertEquals("ODoyle", testReview.getAuthor());
    }

    @Test
    public void toString_test() {
        Review testReview = new Review("YelloTown", "McBurger", 5, "Gimmie that Sauce");
        System.out.println();
        assertEquals("YelloTown. For Gimmie that Sauce With 5 star rating from McBurger", testReview.toString());
    }

}