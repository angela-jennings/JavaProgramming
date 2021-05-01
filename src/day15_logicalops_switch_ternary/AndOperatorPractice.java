package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Hail Satan Mug";

        if(onSale && freeShipping){    //adds to cart only when item is both on sale and has free shipping
            System.out.println(itemName + " is on sale!");
            System.out.println("You qualify for free shipping on " + itemName);
        }else{
            System.out.println("Keep shopping for a better deal");
        }

        if(onSale && freeShipping && itemName.equals("Hail Satan Mug")){
            System.out.println("add to cart - " + itemName);
        }else{
            System.out.println("keep shopping for better deals on " + itemName);
        }


        }
    }
