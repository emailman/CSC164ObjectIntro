package p1;

import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Created by emailman on 2/16/2016.
 */

public class BalloonTest {

    @Test
    public void testDefault() throws Exception {
        // Create a default balloon
        Balloon b = new Balloon();

        // Check size
        assertEquals(10, b.getSize());

        // Check color
        assertEquals("blue", b.getColor());
    }
}