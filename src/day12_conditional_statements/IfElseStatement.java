package day12_conditional_statements;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* if (10 > 5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }
        int score = 44;
        if (score > 60) {
            System.out.println("Passed Test");
        } else {
            System.out.println("Failed Test");
        }

        int count = 25;
        if (count > 30) {
            System.out.println("Count is more than 30");
        }else {
            System.out.println("count is less than 30");
        }*/

        System.out.println("Enter your current age: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Congrats, you can participate in our flawed democracy");
        }else{
            System.out.println("You cannot vote, you moron");
        }
    }

}
