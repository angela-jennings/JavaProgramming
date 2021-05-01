package day32_arrays_split;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //print array values as a string, in same line with no loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        System.out.println();



        System.out.println("-----print the most expensive item-----");
        double maxPrice = prices[0]; //assume first price is max as a reference point
        int indexOfMaxPrice = 0; //assume first item is most expensive
        for(int i = 0; i<prices.length; i++){
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice = i;

            }
        }
        System.out.println(items[indexOfMaxPrice] + " - " + prices[indexOfMaxPrice] + " - " + itemIDs[indexOfMaxPrice]);


        System.out.println("-----print the least expensice item-----");
        double minPrice = prices[0];
        int indexOfMinPrice = 0;
        for(int i = 0; i <prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println(items[indexOfMinPrice] + " - " + prices[indexOfMinPrice] + " - " + itemIDs[indexOfMinPrice]);
    }
}
