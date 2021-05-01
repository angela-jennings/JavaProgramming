package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums)); //prints all numbers within square brackets separated by commas and space

        Arrays.sort(nums); //have to declare that you want array sorted
        System.out.println(Arrays.toString(nums)); //have to combine arrays.tostring(variable name)

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);


        String[] words = {"Athena", "Koga", "Fat Dog", "Little Princess", "Baby", "Tina"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));



    }
}
