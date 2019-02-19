package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Barry's Barmy Bumpers");
    }

    @Test
    public void hasName(){
        assertEquals("Barry's Barmy Bumpers", dodgems.getName());
    }
}
