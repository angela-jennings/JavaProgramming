package replit_tasks;
import java.util.*;

public class MaxNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums = {5, 6, 8, 3, 9};
        Arrays.sort(nums);
        System.out.println(nums[4]);
    }
}
