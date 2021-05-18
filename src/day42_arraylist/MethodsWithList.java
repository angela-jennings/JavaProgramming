package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
       List<String> names = new ArrayList<>(Arrays.asList("Angela", "Koga", "Athena", "Matt", "Sarah", "Hana", "Hubby"));
       printStrList(names);
        System.out.println("\n----------");
       List<Integer> nums = new ArrayList<>(Arrays.asList(5, 10, 20));
        System.out.println(sumIntegerList(nums));
    }

    public static void printStrList(List<String> strs){
        for(String each: strs){
            System.out.print(each + " ");
        }
    }

    public static int sumIntegerList (List<Integer> nums){
        int sum = 0;
        for(int i = 0; i<nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

}
