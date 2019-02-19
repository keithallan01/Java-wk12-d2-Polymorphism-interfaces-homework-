package attractions;

import stall.ISecurity;
import visitor.Visitor;

public class Rollercoaster extends Attractions implements ITicketed, ISecurity {

    public Rollercoaster(String name) {
        super(name);
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return this.defaultPrice() * 2;
        } else {
            return this.defaultPrice();
        }
    }



    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }


}
