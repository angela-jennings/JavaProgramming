package day41_arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 45, 23, 645, 234, 456, 2342, 455); //immutable
        System.out.println("nums = " + nums);
      //  nums.add(100); //cant add or remove. get error message - "unsupported operation"
      //  System.out.println("new nums = " + nums);

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,5,6,7)); //now you can add/remove/clear
        nums1.add(100);
        nums1.add(54);
        System.out.println(nums1);
        nums1.remove(2);
        System.out.println(nums1);
        nums1.remove(new Integer(1));
        System.out.println(nums1);


        List <String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("iced coffee", "green tea", "red bull", "soda", "mocha", "latte", "black tea"));
        int caffeineAmount = 0;
        for(String each : drinksWithCaffeine){
            if(each.equals("iced coffee") || each.equals("green tea") || each.equals("red bull")){
                caffeineAmount = 100;
                System.out.println(each + " - " + caffeineAmount + " mg caffeine");
            }else if(each.equals("soda") || each.equals("mocha")){
                caffeineAmount = 150;
                System.out.println(each + " - " + caffeineAmount + " mg caffeine");
            }else if(each.equals("latte") || each.equals("black tea")){
                caffeineAmount = 200;
                System.out.println(each + " - " + caffeineAmount + " mg caffeine");
            }

            System.out.println("--------------------");
            System.out.println("this is forEach block ");
            drinksWithCaffeine.forEach(drink -> {
                System.out.println("drink = " + drink);
            });

        }





    }
}
