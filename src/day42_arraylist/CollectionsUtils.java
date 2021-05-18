package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtils {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        Collections.reverse(letters);
        System.out.println("letters unreversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a')); //frequency counts frequency in array list
        System.out.println(Collections.frequency(letters, 'b'));

        System.out.println("Max char = " + Collections.max(letters)); //returns highest character - from ascii value
        System.out.println("Min char = " + Collections.min(letters));  //returns smallest character

        Collections.replaceAll(letters, 'a', 'z');
        System.out.println("after replace all - " + letters);


        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,64, 434, 1, 2343, 634, 234, 1, 6456, 3423, 534));
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse - " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("Frequency of number 1 = " + Collections.frequency(nums, 1));
        Collections.sort(nums);
        System.out.println(nums + " <---- after sorting");

        Collections.reverse(nums);
        System.out.println(nums + " <---- after reverse");

        Collections.shuffle(nums);
        System.out.println(nums + " <---- after shuffling the numbers");


    }
}
