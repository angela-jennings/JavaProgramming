package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        int budget = 5000;
        String model = "Toyota";
        int carPrice = 5500;

        if(carPrice<=budget && (model.equals("Honda") || model.equals("Toyota"))){
            System.out.println("That is a suitable " + model + " - go ahead and purchase for " + carPrice);
        }else{
            System.out.println("Keep looking for a better vehicle");
        }
    }
}
