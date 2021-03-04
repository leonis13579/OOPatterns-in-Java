package SnekHistory;

public class Snikers implements IProduct {
    double cost;

    public Snikers() {
        cost = 28;
    }

    @Override
    public String getName() {
        return "Snikers";
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
