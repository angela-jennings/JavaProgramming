package day58_polymorphism.OnlineShoppingExamples;

public abstract class OnlineShop {
    public abstract void buy();
    public abstract void sell();
    public void ship(){
        System.out.println("Shipping purchased items");
    }
}
