package replit_tasks;
import java.util.Arrays;

public class FindNonDuplicate {
    public static void main(String[] args) {

        int[] nums = {5, 5, 3, 6, 8, 6, 8}; // -->3 is non duplicate

        int temp = 0;
        boolean nonDup = true;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            nonDup = true;
            for (int j = 0; j < nums.length; j++) {
                if (temp == nums[j] && i != j) {
                    nonDup = false;
                    break;
                }


            }
            if (nonDup == true) {
                System.out.println(temp);
            }
        }

    }
}















