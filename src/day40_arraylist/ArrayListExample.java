package day40_arraylist;
import java.util.*;
// import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(666);
        nums.add(123);
        nums.add(345);
        System.out.println(nums.size());

        //read from arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));

        //print all values in same line:
        System.out.println(nums); //with arraylist you dont need to use the Array.toString(nums) like you would need for primitive data types with regular arrays

        nums.remove(1); //removes element at index 1
        System.out.println(nums);





    }
}
