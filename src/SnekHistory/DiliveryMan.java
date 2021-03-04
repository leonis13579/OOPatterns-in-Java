package SnekHistory;

public class DiliveryMan {
    public static void main(String[] args) {
        Automat automat = Automat.getInstance();

        automat.AddProduct(new DiliverySnikers().DeleviryProuct());
        automat.AddProduct(new DiliverySnikers().DeleviryProuct());
        automat.AddProduct(new DiliverySnikers().DeleviryProuct());

        automat.AddProduct(new DiliveryTwiks().DeleviryProuct());
        automat.AddProduct(new DiliveryTwiks().DeleviryProuct());

        System.out.println(automat);
    }
}
