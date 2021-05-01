package replit_tasks;

import java.util.Scanner;

public class VideoGameTokens {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
        int numOfCandies = coupons / 10;
        int numOfGumballs = (coupons % 10) / 3;

        if(coupons<3){
            System.out.println("Not enough coupons");
        }else{
            System.out.println("Number of Candies: " + numOfCandies);
            System.out.println("Number of Gumballs: " + numOfGumballs);}

    }
}

