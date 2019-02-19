package stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("DeVito's Creamery", "Danny DeVito", 45);
    }

    @Test
    public void hasName(){
        assertEquals("DeVito's Creamery", iceCreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Danny DeVito", iceCreamStall.getOwner());
    }

    @Test
    public void hasParkingSpotNumber(){
        assertEquals(45, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }
}
