package attractions;

import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor tallboy;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Looping Star");
        tallboy = new Visitor("Bruce Willis", 14, 210, 50);

    }

    @Test
    public void hasName(){
        assertEquals("Looping Star", rollercoaster.getName());
    }

    @Test
    public void canRideRollercoaster(){
        assertEquals(true, rollercoaster.isAllowedTo(tallboy));
    }

    @Test
    public void chargesDoubleForTallBoys(){
        assertEquals(16.80, rollercoaster.priceFor(tallboy), 0.01);
    }
}
