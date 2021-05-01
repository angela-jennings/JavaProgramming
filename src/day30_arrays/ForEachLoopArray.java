package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for(int each : data){
            System.out.print(each + " "); //prints same line separated by space
        }
        System.out.println();

        /*for (int n : data){
            System.out.println(n); //prints on separate lines
        }*/

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");  //when printing an array with for loop, need to use square brackets
        }

        System.out.println();
        //to print the last value of an array
        System.out.println(data[9]); //using last index number
        System.out.println(data[data.length-1]); //if you dont know last index number, you can do length -1
        //length always starts at 1, similar to counting characters, so you need to add -1 to get correct index numbers since index numbers always start at position 0
        System.out.println();
        //print all numbers backwards in same line
        for(int idx = data.length-1; idx>=0; idx--){
            System.out.print(data[idx] + " ");
        }

        }
    }

