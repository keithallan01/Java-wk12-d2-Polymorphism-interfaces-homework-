import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Bruce Willis", 63, 1.83);
    }

    @Test
    public void hasName(){
        assertEquals("Bruce Willis", visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(63,visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.83, visitor.getHeight(), 0.01);
    }
}
