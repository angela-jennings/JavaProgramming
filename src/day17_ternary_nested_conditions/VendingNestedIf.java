package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea selected");
            } else {
                System.out.println("coke item is selected");
            }

        } else if (selection.equals("snack")) {
            System.out.println("snack option selected");
            if (snackItem.equals("chips")) {
                System.out.println("chips are selected");
            } else {
                System.out.println("candy bar is selected");
            }
        }
    }
}

