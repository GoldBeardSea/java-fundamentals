/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritence;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void restaurant_consructor_test(){
        Restaurant testaurant = new Restaurant("Not Gonna Fly", 4, "$$");
        testaurant.toString();
        assertEquals("Not Gonna Fly has a 4 star rating and is $$ expensive", testaurant.toString());
    }

    @Test
    public void addReview() {
        Restaurant testaurant = new Restaurant("Not Gonna Fly", 5, "$$");
        Review testReview = new Review("Bro I'm straight up not having a good time right now", "BroJam", 1, "Not Gonna Fly");
        testaurant.addReview(testReview);
        assertEquals(3, testaurant.getRating());
    }

    @Test
    public void addReview_testMismatchedName() {
        Restaurant testaurant = new Restaurant("Not Gonna Fly", 5, "$$");
        Review testReview = new Review("Bro I'm straight up not having a good time right now", "BroJam", 1, "Not Gonna Fly");
        testaurant.addReview(testReview);
        Review testReview2 = new Review("This is a pretty good rating but the names don't match", "NiceRev", 5, "Oops wrong name");
        testaurant.addReview(testReview2);
        assertEquals(3, testaurant.getRating());
    }
}
