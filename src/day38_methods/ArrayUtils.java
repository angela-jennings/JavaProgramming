package day38_methods;

public class ArrayUtils {
    public static void printArray(int[] nums){
        for(int each: nums){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public static int sum (int[] nums){
        int sum = 0;
        for(int each : nums)
        sum += each;
        System.out.println(sum);
        return sum;
    }

    public static boolean contains (int[] nums, int num){
        for(int each : nums){
            if(each == num){
                //System.out.println("Number in array = " + each + " - Number to check = " + num);
                return true;
            }
        }
        return false;
    }
}
