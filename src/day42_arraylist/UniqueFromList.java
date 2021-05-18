package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 7, 3, 6, 1, 87));
        getUniqueIntegers(nums);


    }

    public static void getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniqueNums = new ArrayList<>();
        for(int num: nums){
            if(Collections.frequency(nums, num) == 1){
                //System.out.println(num + " only occurs once");
                uniqueNums.add(num);
            }
        }
        System.out.println(uniqueNums); //added all unique numbers to a new array list
    }
}
