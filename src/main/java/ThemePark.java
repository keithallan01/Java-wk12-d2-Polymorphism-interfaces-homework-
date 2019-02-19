import attractions.*;
import stall.CandyFlossStall;
import stall.IceCreamStall;
import stall.TobaccoStall;
import visitor.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private Dodgems dodgems;
    private Park park;
    private Rollercoaster rollercoaster;
    private Playground playground;
    private CandyFlossStall candyFlossStall;
    private TobaccoStall tobaccoStall;
    private IceCreamStall iceCreamStall;
    private Visitor visitor;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(String name, Dodgems dodgems, Park park, Rollercoaster rollercoaster, Playground playground, CandyFlossStall candyFlossStall, TobaccoStall tobaccoStall, IceCreamStall iceCreamStall, Visitor visitor){
        this.name = name;
        this.park = park;
        this.dodgems = dodgems;
        this.rollercoaster = rollercoaster;
        this.playground = playground;
        this.candyFlossStall = candyFlossStall;
        this.tobaccoStall = tobaccoStall;
        this.iceCreamStall = iceCreamStall;
        this.visitor = visitor;
        this.reviewed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Dodgems getDodgems() {
        return dodgems;
    }

    public Park getPark() {
        return park;
    }

    public Rollercoaster getRollercoaster() {
        return rollercoaster;
    }

    public Playground getPlayground() {
        return playground;
    }

    public CandyFlossStall getCandyFlossStall() {
        return candyFlossStall;
    }

    public TobaccoStall getTobaccoStall() {
        return tobaccoStall;
    }

    public IceCreamStall getIceCreamStall() {
        return iceCreamStall;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.reviewed;
    }
}
