package SnekHistory;

public class Twiks implements IProduct {
    double cost;

    public Twiks() {
        cost = 25;
    }

    @Override
    public String getName() {
        return "Twiks";
    }

    @Override
    public double getCoast() {
        return cost;
    }

    @Override
    public int compareTo(IProduct product) {
        return getName().compareTo(product.getName());
    }
}
