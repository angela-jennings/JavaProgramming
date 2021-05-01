package extra_tasks;
import java.util.Scanner;

public class MinimumNumberReturn {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
       int num1 = scan.nextInt();
        System.out.println("Enter number 2");
       int num2 = scan.nextInt();
        System.out.println("Enter number 3");
       int num3 = scan.nextInt();

       if (num1<num2 && num1<num3){
           System.out.println("Number 1 is lowest");
       }else if(num2<num1 && num2<num3 ){
           System.out.println("Number 2 is lowest");
       }else if(num3<num1 && num3<num2){
           System.out.println("Number 3 is lowest");
       }else{
           System.out.println("There is not a lowest number");
       }




    }
}

    //Write a java program that accepts three numbers and return the minimum number (assume that none of them are equal)s