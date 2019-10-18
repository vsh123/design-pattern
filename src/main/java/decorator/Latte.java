package decorator;

public class Latte extends Beverage {

    public Latte(String name, int cost) {
        super(name, cost);
    }

    public int cost() {
        return getCost();
    }
}
