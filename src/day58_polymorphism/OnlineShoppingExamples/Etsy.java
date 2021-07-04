package day58_polymorphism.OnlineShoppingExamples;

public class Etsy extends OnlineShop implements HandMade{
    @Override
    public void buy() {
        System.out.println("Buying on Etsy");
    }

    @Override
    public void sell() {
        System.out.println("Selling on Etsy");
    }

    @Override
    public boolean isHandMade() {
        return true;
    }
}
