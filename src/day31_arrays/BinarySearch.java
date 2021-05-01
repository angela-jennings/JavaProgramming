package day31_arrays;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 123));
        System.out.println(Arrays.binarySearch(nums, 654));
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 12345));
        System.out.println(Arrays.binarySearch(nums, 14421));

        //only works when array is sorted and only can find numbers in the array - otherwise you get a negative value
        //returns index numbers, index numbers always start at 0
    }
}
