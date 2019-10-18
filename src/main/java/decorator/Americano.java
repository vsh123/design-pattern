package decorator;

public class Americano extends Beverage {

    public Americano(String name, int cost) {
        super(name, cost);
    }

    public int cost() {
        return getCost();
    }
}
