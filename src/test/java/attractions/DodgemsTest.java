package attractions;

import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor child;

    @Before
    public void before(){
        dodgems = new Dodgems("Barry's Barmy Bumpers");
        child = new Visitor("Frank", 10, 210, 17);
    }

    @Test
    public void hasName(){
        assertEquals("Barry's Barmy Bumpers", dodgems.getName());
    }

    @Test
    public void chargedHalfPriceForUnder12(){
        assertEquals(2.25, dodgems.priceFor(child), 0.01);
    }


}
