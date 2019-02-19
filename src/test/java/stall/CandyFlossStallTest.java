package stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("The Sweet Tooth", "Sandy Belle", 44);
    }

    @Test
    public void hasName(){
        assertEquals("The Sweet Tooth", candyFlossStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Sandy Belle", candyFlossStall.getOwner());
    }

    @Test
    public void hasParkingSpotNumber(){
        assertEquals(44, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }
}
