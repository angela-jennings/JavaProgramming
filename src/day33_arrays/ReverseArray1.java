package day33_arrays;
import java.util.*;
public class ReverseArray1 {
    public static void main(String[] args) {
        int[] nums = {666, 333, 777, 888};
        int[] numsRev = new int[nums.length]; //reassign new array the length of array we want to reverse

        for(int i = nums.length-1, j = 0; i>=0; i--, j++){
            numsRev[j] = nums[i];
            //System.out.print(nums[i] + " "); //this prints arrays backwards but doesnt reassign them into a new array
        }
        System.out.println(Arrays.toString(numsRev));
        System.out.println((Arrays.toString(numsRev)));
    }
}
