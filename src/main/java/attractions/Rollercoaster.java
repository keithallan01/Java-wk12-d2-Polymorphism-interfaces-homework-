package attractions;

import stall.ISecurity;
import visitor.Visitor;

public class Rollercoaster extends Attractions implements ITicketed, ISecurity {

    public Rollercoaster(String name) {
        super(name);
    }

    public double defaultPrice(){
        return 6;
    }

    public double priceFor(Visitor visitor){
        return 6;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }


}
