package SnekHistory;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Automat {
    private static Automat instance = null;

    public static Automat getInstance() {
        if (instance == null) {
            instance = new Automat();
        }
        return instance;
    }

    private Automat() {}


    Map<IProduct, Integer> snaks = new TreeMap<>();

    void AddProduct(IProduct product) {
        int count = snaks.getOrDefault(product, 0);
        snaks.put(product, count + 1);
    }

    boolean BuyProduct(IProduct product) {
        int count = snaks.getOrDefault(product, 0);
        if (count > 0) {
            snaks.put(product, count - 1);
            return true;
        } else {
            return false;
        }
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
}
