package day54_abstraction;

public class Salad extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Preparing your salad");
    }
    @Override
    public void serve(){
        System.out.println("Serving your salad");
    }

    @Override
    public void price() {
        System.out.println("Salad price varies depending on toppings and size");
    }
}
