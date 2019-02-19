package attractions;

import stall.ISecurity;
import visitor.Visitor;

public class Playground extends Attractions implements ISecurity, IReviewed {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 15){
        return true;
        } else {
            return false;
        }
    }
}