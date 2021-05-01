package day33_arrays;
import java.util.*;

public class ReverseArray2 {
    public static void main(String[] args) {
        //replace the e after j in last name to o
        String name = "Angela Jennings";
        String[] newName = name.split(" ");
        System.out.println(newName[0] + " " + newName[1].replaceFirst("n", "o"));

        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //swap these numbers using additional variable
       // num2 = num1;
        //num1 = num2; //both are 10 because num2 was assigned 10 so when num1 = num2 it is already 10
        int temp = num1; // using a temporary int placeholder to hold the value of 10 then reassign num2 as temp
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        int[]nums = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0];
        //int temp2 = nums[1];
        nums[0] = nums[3];
        //nums[1] = nums[2];
        //nums[2] = temp2;
        nums[3] = temp;

        System.out.println("after swap: " + Arrays.toString(nums)); //above is by swapping all values

        int[] nums2 = {5, 10, 4, 100}; //using for loop too swap values
        for(int i = 0; i < nums2.length/2; i++){
            int temp3 = nums2[i];
            nums2[i] = nums2[nums2.length-1-i];
            nums2[nums2.length - 1 - i] = temp3;
        }
        System.out.println("after swap with loop = " + Arrays.toString(nums2));


        System.out.println();
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before words swap: " + Arrays.toString(words));


        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--){
            String tempWords = words[i];
            words[i] = words[j];
            words[j] = tempWords;
        }
        System.out.println("words after swap: " + Arrays.toString(words));
    }
}
