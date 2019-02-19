package attractions;


import visitor.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceFor(Visitor visitor);
}
