package day58_polymorphism.OnlineShoppingExamples;

public class Amazon extends OnlineShop implements Prime{
    @Override
    public void buy() {
        System.out.println("Buying on Amazon");
    }

    @Override
    public void sell() {
        System.out.println("Selling on Amazon");
    }

    @Override
    public boolean primeShipping() {
        return true;
    }
}
