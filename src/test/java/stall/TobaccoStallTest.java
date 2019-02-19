package stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Up In Smoke", "Ciggy McGraw", 43);
    }

    @Test
    public void hasName(){
        assertEquals("Up In Smoke", tobaccoStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Ciggy McGraw", tobaccoStall.getOwner());
    }

    @Test
    public void hasParkingSpotNumber(){
        assertEquals(43, tobaccoStall.getParkingSpot());
    }
}
