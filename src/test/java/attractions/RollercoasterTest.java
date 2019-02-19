package attractions;

import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Looping Star");
        visitor = new Visitor("Bruce Willis", 14, 183, 50);

    }

    @Test
    public void hasName(){
        assertEquals("Looping Star", rollercoaster.getName());
    }

    @Test
    public void canRideRollercoaster(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }
}
