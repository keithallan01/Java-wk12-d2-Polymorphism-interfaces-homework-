package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Jurassic Park");
    }

    @Test
    public void hasName(){
        assertEquals("Jurassic Park", park.getName());
    }
}
