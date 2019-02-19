package stall;

import visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity{

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
}
