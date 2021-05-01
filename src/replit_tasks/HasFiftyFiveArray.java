package replit_tasks;
import java.util.*;

public class HasFiftyFiveArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 8, 5, 5, 0};

        int x = 5;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == x && nums[i + 1] == 5) {
                result = 1;
                System.out.println("true");
                break;
            }
            if (nums[i] != x && nums[i + 1] != 5) {
                    result = 0;
                    }
                }
        if(result==0){
            System.out.println("false");
        }

            }
        }






