package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare(){
        System.out.println("Preparing your pizza");
    }
    @Override
    public void serve(){
        System.out.println("Serving your pizza");
    }
    @Override
    public void price(){
        System.out.println("The price of pizza varies by size and toppings");
    }
}
