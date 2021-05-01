package extra_tasks;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to see if it is divisible by 2, 3 or 5");

        int isDivisible = scan.nextInt();
        boolean remainder1 = (isDivisible%2==0);
        boolean remainder2 = (isDivisible%3==0);
        boolean remainder3 = (isDivisible%5==0);

        /*if(remainder1){
            System.out.println(isDivisible + " is divisible by 2 " + remainder1);
        }
        if(remainder2){
            System.out.println(isDivisible + " is divisible by 3 " + remainder2);
        }
        if (remainder3) {
            System.out.println(isDivisible + " is divisible by 5 " + remainder3);
        }*/

        System.out.println(isDivisible + " is divisible by 2 " + remainder1);
        System.out.println(isDivisible + " is divisible by 3 " + remainder2);
        System.out.println(isDivisible + " is divisible by 5 " + remainder3);

    }
}
