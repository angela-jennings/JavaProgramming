package day09_scanner_practice;
import java.util.Scanner;

public class CentsToDollars {
    public static void main (String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter how many cents you have: ");
     int cents = scan.nextInt();
     int dollars = cents/100;
     int remainingCents = cents%100;
     System.out.println(remainingCents);
     //int cents1 = 597;
     //int dollar = cents/100;

        //System.out.println("cents = " + cents1);
        //System.out.println("dollar = " + dollar);
        //System.out.println("remainingCents = " + remainingCents);


    }
}
