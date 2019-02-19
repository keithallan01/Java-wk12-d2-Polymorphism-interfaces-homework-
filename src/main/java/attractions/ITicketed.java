package attractions;

import sun.reflect.generics.visitor.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceFor(Visitor visitor);
}
