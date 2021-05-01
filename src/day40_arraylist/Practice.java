package day40_arraylist;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
//        String one = "1";
//        int newOne = Integer.parseInt(one);
//        System.out.println(newOne + " is now an Integer");
//
//        noLoop(0);
//        System.out.println();
//
//        System.out.println(reverseName("angela"));
//
//        System.out.println(sum(1, sum(0, 1)));


        String broke = "I borrowed 53 dollars from Angela, 37 dollars from Anton and 2305 dollars from the very rich Nuriddin";
        int sum = 0;
        String howMuchMoney = "";
        //add the sum of dollars
        for(int i = 0; i< broke.length(); i++){
            if(Character.isDigit(broke.charAt(i))){
                howMuchMoney += broke.charAt(i);
            }
        }
        sum = Integer.parseInt(howMuchMoney);
        System.out.println(sum);


    }
    public static void noLoop (int n){
        if(n <= 100){
            System.out.print(n + " ");
            noLoop(n + 1);
        }
    }

    public static String reverseName(String name){
        String reverse = "";
        for(int i = name.length()-1; i>=0; i--){
            reverse += name.charAt(i);
        }
        return reverse;
    }

    public static int sum(int a, int b){
        if(a+b>1)
            return 0;
        System.out.println(a+b);
        return a+b;
    }
}
