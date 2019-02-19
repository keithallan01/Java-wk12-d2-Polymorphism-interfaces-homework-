import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stall.CandyFlossStall;
import stall.IceCreamStall;
import stall.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Playground playground;
    Park park;
    CandyFlossStall candyFlossStall;
    TobaccoStall tobaccoStall;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark("Keith's Wonderland", dodgems, park, rollercoaster, playground, candyFlossStall, tobaccoStall, iceCreamStall, visitor);
    }

    @Test
    public void hasName(){
        assertEquals("Keith's Wonderland", themePark.getName());
    }



}
