package stall;

import attractions.ITicketed;
import visitor.Visitor;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }

    public double defaultPrice(){
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
