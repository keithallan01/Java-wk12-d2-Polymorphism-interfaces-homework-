package attractions;


import visitor.Visitor;

public class Dodgems extends Attractions implements ITicketed {

    public Dodgems(String name) {
        super(name);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <12 ) {
            return this.defaultPrice() / 2;
        } else {
            return this.defaultPrice();
        }
    }

}
