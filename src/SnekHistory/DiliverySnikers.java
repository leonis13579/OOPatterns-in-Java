package SnekHistory;

public class DiliverySnikers implements IDelivery {

    @Override
    public IProduct DeleviryProuct() {
        return new Snikers();
    }
}
