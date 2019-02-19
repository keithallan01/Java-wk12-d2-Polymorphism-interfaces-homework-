package attractions;

import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("The Sandbox");
        visitor = new Visitor("Bruce Willis", 14, 1.83, 50);
    }

    @Test
    public void hasName(){
        assertEquals("The Sandbox", playground.getName());
    }

    @Test
    public void cannotBeOver15(){
       assertEquals(false, playground.isAllowedTo(visitor));
    }
}
