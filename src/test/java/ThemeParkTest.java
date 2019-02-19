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
        dodgems = new Dodgems("Barry's Barmy Bumpers");
        park = new Park("Jurassic Park");
        rollercoaster = new Rollercoaster("Looping Star");
        playground = new Playground("The Sandbox");
        candyFlossStall = new CandyFlossStall("The Sweet Tooth", "Sandy Belle", 44);
        tobaccoStall = new TobaccoStall("Up In Smoke", "Ciggy McGraw", 43);
        iceCreamStall = new IceCreamStall("DeVito's Creamery", "Danny DeVito", 45);
        visitor = new Visitor("Bruce Willis", 63, 1.83, 53.67);

    }

    @Test
    public void hasName(){
        assertEquals("Keith's Wonderland", themePark.getName());
    }

//    @Test
//    public void visitorCanVisitAttraction(){
//        assertEquals()
//    }





}
