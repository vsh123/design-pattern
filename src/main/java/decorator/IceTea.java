package decorator;

public class IceTea extends Beverage {
    public IceTea(String name, int cost) {
        super(name, cost);
    }

    public int cost() {
        return getCost();
    }
}
