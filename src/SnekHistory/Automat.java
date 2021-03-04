package SnekHistory;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Automat {
    Map<IProduct, Integer> snaks = new TreeMap<>();

    void AddProduct(IProduct product) {
        int count = snaks.getOrDefault(product, 0);
        snaks.put(product, count + 1);
    }

    @Override
    public String toString() {
        String out = "";

        TreeSet<IProduct> keys = new TreeSet<>(snaks.keySet());

        for (IProduct product : keys) {
            out += product.getName() + " : " + snaks.get(product) + "штук \n";
        }

        return out;
    }

    public static void main(String[] args) {
        Automat automat = new Automat();

        automat.AddProduct(new DiliverySnikers().DeleviryProuct());
        automat.AddProduct(new DiliverySnikers().DeleviryProuct());
        automat.AddProduct(new DiliverySnikers().DeleviryProuct());

        automat.AddProduct(new DiliveryTwiks().DeleviryProuct());
        automat.AddProduct(new DiliveryTwiks().DeleviryProuct());

        System.out.println(automat);
    }
}
