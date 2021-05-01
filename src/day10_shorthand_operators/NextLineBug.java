package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Did you pay rent this month? ");
        boolean payRent = scan.nextBoolean();
        System.out.print("What did you pay for rent this month? ");
        int rent = scan.nextInt();
        System.out.print("What month are you paying rent for? ");
        scan.nextLine(); //this is what you have to put to fix glitch
        String month = scan.nextLine();
        System.out.println("You paid $" + rent + " for the month of " + month + " and rent was paid on time: " + payRent);


    }
}
