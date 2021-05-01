package day18_conditions_practice_strings_intro;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to see if it is divisible by 3, 5 or both");
        int number = scan.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }else if(number%3==0){
            System.out.println("Fizz");
        }else if(number%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }
    }
}
