package SnekHistory;

import java.util.ArrayList;
import java.util.List;

public class AutomatLifeCicle {

    public static void main(String[] args) {
        List<IDelivery> deliveries = new ArrayList<>();

        deliveries.add(new DiliverySnikers());
        deliveries.add(new DiliverySnikers());
        deliveries.add(new DiliverySnikers());
        deliveries.add(new DiliverySnikers());

        deliveries.add(new DiliveryTwiks());
        deliveries.add(new DiliveryTwiks());
        deliveries.add(new DiliveryTwiks());

        for (IDelivery delivery : deliveries) {
            Automat.getInstance().AddProduct(delivery.DeleviryProuct());
        }

        System.out.println(Automat.getInstance());

        Automat.getInstance().BuyProduct(new Snikers());

        System.out.println(Automat.getInstance());
    }
}
