package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drinking 10 percent = " + myCoffee.getAmount());

        myCoffee.setType("latte");
        System.out.println(myCoffee.getType());

        System.out.println(myCoffee.toString());

        Coffee yourCoffee = new Coffee();
        yourCoffee.setType("iced coffee");
        yourCoffee.refill();
        System.out.println("yourCoffee = " + yourCoffee);
        yourCoffee.drink(50);
        System.out.println(yourCoffee.getAmount());
        yourCoffee.refill();
        System.out.println(yourCoffee.getAmount());


        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type - " + coffee1.getType());
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 = " + coffee2);
        coffee2.setType("espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("mocha");

        coffee3 = coffee2;
        System.out.println("coffee3 = " + coffee3);

        Coffee coffee4 = null;
        coffee1.setType("iced latte"); // get null pointer exception because no object was created in coffee4 to assign "iced latte"


    }
}
