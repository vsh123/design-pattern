package decorator;

public class DecorateOption extends Beverage {
    //메뉴를 Composition하고 있다.
    private Beverage beverage;

    public DecorateOption(Beverage beverage, String name, int cost) {
        super(name, cost);
        this.beverage = beverage;
    }

    public int cost() {
        //데코하고 있는 메뉴 가격 + 옵션 가격을 리턴한다.
        return beverage.cost() + getCost();
    }
}
