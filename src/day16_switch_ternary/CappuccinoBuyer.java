package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price = 0;
        int calories = 0;
        String size = "grande";

        switch(size){
            case "tall":
                System.out.println("Tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                price = 4.29;
                calories = 150;
            default:
                System.out.println("We do not serve that size cappuccino");
        }

        System.out.println("Price = " + price + " Calories = " + calories);
    }
}
