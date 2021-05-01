package day40_arraylist;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();  //polymorphic way of declaring
        System.out.println(nums); //gives empty square brackets
        System.out.println("size = " + nums.size());  //size is 0

        nums.add(34); nums.add(45); nums.add(345); nums.add(234);
        nums.add(78); nums.add(38); nums.add(3); nums.add(24);
        nums.add(78); nums.add(38); nums.add(3); nums.add(24);

        System.out.println("nums = " + nums);
        nums.remove(0); //remove first index
        System.out.println("nums = " + nums);

        nums.remove(new Integer(45)); //this way you can remove a specified number
        System.out.println("nums = " + nums);

        nums.remove(new Integer(78)); // removes only the first 78

        //for loop - iterate through all values and print
        for(int i = 0; i<nums.size(); i++){ //need to use nums.size() not .length
            System.out.println(nums.get(i));  //need to use nums.get(i) no square brackets for array list
        }

        //for each loop
        for(Integer each : nums){ //can use Integer or int - if using int it automatically unboxes
            System.out.print(each + " ");  //dont need to use get
        }

    }
}
