package replit_tasks;
import java.util.*;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 3, 2, 1};
        //outcome should be {5, 4, 3, 2, 1, 6}
        /*int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = nums[3];
        nums[3] = nums[4];
        nums[4]= nums[5];
        nums[nums.length-1] = temp; //this only works if array is always same length*/

        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length-1; i++){
            newArr[i] = nums[i+1];
        }
        newArr[newArr.length-1] = nums[0];

        System.out.println(Arrays.toString(newArr));


    }
}
