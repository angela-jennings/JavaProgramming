package day32_arrays_split;
import java.util.*;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("Ipad price: $" + prices[4]);

        System.out.println("Find index of 'gloves' in item array ");
        for(int i = 0; i < items.length; i++){
            if(items[i].equals("Gloves")){   //prints only for glove
                //int indexOfGloves = i; //assigns variable to gloves
                System.out.print("gloves = " + i);
                break;
            }
        }
        System.out.println();

        for(int i = 0; i < items.length; i++){
            System.out.println(i + " - " + items[i]); //prints for all items with index number
        }

        System.out.println();
        System.out.println("-----set boolean to true if first iPad is found-----");
        boolean ipadExists = false;

        for (int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Ipad")){
                ipadExists = true;
            }
        }

        for(String item : items){
            if(item.equalsIgnoreCase("Ipad")){
                ipadExists = true;
            }
        }
        System.out.println("ipad exists = " + ipadExists);
        if(ipadExists){
            System.out.println("we bought the ipad!");
        }else{
            System.out.println("we forgot the ipad");
        }

        System.out.println("-----print a report of each item-----");
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);

        }


        System.out.println("----------Look for item jacket and print price and item id----------");
        for (int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }
    }
}
