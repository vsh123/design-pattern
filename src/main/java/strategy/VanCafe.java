package strategy;

public class VanCafe implements Cafe {
    private int americano = 2000;
    private int iceTea = 1500;

    public int priceOfAmericano(Discount discount) {
        double percent = (100 - discount.getdiscountRate()) / (double) 100;
        return (int) (americano * percent);
    }

    public int priceOfIceTea(Discount discount) {
        double percent = (100 - discount.getdiscountRate()) / (double) 100;
        return (int) (iceTea * percent);
    }
}
