package decorator;

public abstract class Beverage {
    //커피 이름과 가격이 있다.
    private String name;
    private int cost;

    public Beverage(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public abstract int cost();
}
