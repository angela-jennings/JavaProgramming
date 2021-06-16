package day54_abstraction;

public class MenuItemObjects {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Salad salad = new Salad();

        pizza.prepare();
        pizza.price();
        pizza.serve();

        salad.prepare();
        salad.prepare();
        salad.serve();
    }
}
