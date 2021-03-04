package SnekHistory;

public class DiliveryTwiks implements IDelivery {

    @Override
    public IProduct DeleviryProuct() {
        return new Twiks();
    }
}
