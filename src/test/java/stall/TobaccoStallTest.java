package stall;

import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Up In Smoke", "Ciggy McGraw", 43);
        visitor = new Visitor("Bruce Willis", 50, 1.83, 50);
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

    @Test
    public void canBuyCigs(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.01);
    }
}
