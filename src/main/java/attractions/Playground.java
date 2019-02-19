package attractions;

import sun.reflect.generics.visitor.Visitor;

public class Playground extends Attractions implements ITicketed{

    public Playground(String name) {
        super(name);
    }

    public double defaultPrice(){
        return 5.50;
    }

    public double priceFor(Visitor visitor){
        return 0;
    }
}
