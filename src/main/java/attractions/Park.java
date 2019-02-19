package attractions;

import sun.reflect.generics.visitor.Visitor;

public class Park extends Attractions implements ITicketed{

    public Park(String name) {
        super(name);
    }

    public double defaultPrice(){
        return 0;
    }

    public double priceFor(Visitor visitor){
        return 0;
    }
}
