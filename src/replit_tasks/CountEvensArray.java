package replit_tasks;
import java.util.*;

public class CountEvensArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //int[] nums = {8, 6, 9, 1, 3};
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
