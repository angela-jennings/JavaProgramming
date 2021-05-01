package office_hours.Practice_04_27_2021;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fib(8);
    }
    public static void fib(int num){

        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i<arr.length; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr)); //prints the array up to the specified number
        System.out.println(arr[arr.length-1]); //prints the number at the given index

    }
}
