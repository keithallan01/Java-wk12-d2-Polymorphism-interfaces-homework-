package attractions;


import visitor.Visitor;

public class Rollercoaster extends Attractions implements ITicketed{

    public Rollercoaster(String name) {
        super(name);
    }

    public double defaultPrice(){
        return 6;
    }

    public double priceFor(Visitor visitor){
        return 6;
    }

}
