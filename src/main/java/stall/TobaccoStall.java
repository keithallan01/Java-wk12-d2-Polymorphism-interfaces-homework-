package stall;

import attractions.ITicketed;
import visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity, ITicketed {

    public TobaccoStall(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
