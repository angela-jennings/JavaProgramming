package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,7,1,9,4,897,2,67,3,5,6665));
        Collections.sort(nums);
        System.out.println(nums);

    }
}
