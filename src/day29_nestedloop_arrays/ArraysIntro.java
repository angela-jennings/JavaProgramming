package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        int [] nums = new int[3]; //array variable, this is longest way to write array
        nums[0] = 5;
        nums [1] = 7;
        nums[2] = 10;
       // nums[3] = 100; //array out of bounds
        System.out.println(nums[0] + nums[1] + nums[2]); //this adds all values
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]); //can use int variable to specify index number
        i++; //adds to index number and prints next in array
        System.out.println(nums[i]);

        System.out.println("number of elements = " + nums.length); //how to find size of array - dont need brackets after length
        int len = nums.length;
        System.out.println(len);

        i = 0;
        nums[0]=500;
        nums[1]=700;
        nums[2]=1000;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
    }
}
