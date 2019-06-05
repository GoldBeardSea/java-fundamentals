package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Restaurant testaurant;
    @Before
    public void initialized() {
        testaurant = new Restaurant("Bullion", 5, "$$$");
    }

    @Test
    public void constructor_author() {
        Review testReview = new Review("Hello", "ODoyle", 2, testaurant);
        assertEquals("ODoyle", testReview.getAuthor());
    }

    @Test
    public void toString_test() {
        Review testReview = new Review("YelloTown", "McBurger", 5, testaurant);
        System.out.println();
        assertEquals("YelloTown. Restaurant: Bullion has a 5 star rating and is $$$ expensive with a 5 star rating from author McBurger", testReview.toString());
    }

}