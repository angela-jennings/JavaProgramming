package day43_list_custom_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 second = 1_000_000_000 nanoseconds


        long start = System.nanoTime(); //get starting time
        List<Integer> mlnNums = getIntegerList(); //returns the arraylist object
        long end = System.nanoTime(); //get end time
        double secs = (end-start)/1_000_000_000.0; //dividing to determine time in seconds
        System.out.println("Integer Array in seconds - " + secs); //printing how many seconds
        System.out.println("Integer Array in nanoseconds - " + (end-start)); //printing how many nanoseconds
        //System.out.println(mlnNums);


        long startArr = System.nanoTime();
        int[] millionNums = getIntegerArray();
        long endArr = System.nanoTime();
        double seconds = (endArr - startArr)/1_000_000_000.0;
        System.out.println("int array time in seconds - " + seconds);
        System.out.println("int array time in nanoseconds - " + (endArr - startArr));
        //System.out.println(Arrays.toString(millionNums));

    }

public static List<Integer> getIntegerList(){
    List<Integer> nums = new ArrayList<>(); //method to print 1 to 1_000_000 in Integer Array
    for(int i = 0; i<=1_000_000; i++){        //this way is slower because Integer is an object
        nums.add(i);
    }
return(nums);
}
public static int[] getIntegerArray(){
        int[] nums= new int[1_000_001];   //method to print array 1 to 1_000_000
        for(int i = 0; i<=1_000_000; i++){   //this method is faster because int is primitive and uses less memory
            nums[i] = i;
        }
        return nums;
}



}

