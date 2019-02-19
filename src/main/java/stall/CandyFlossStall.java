package stall;

import attractions.ITicketed;
import visitor.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }

    public double defaultPrice(){
        return 4.20;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
