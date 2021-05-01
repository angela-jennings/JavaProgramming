package day24_loops;
import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until");
        int numbertoStop = scan.nextInt();
        int countStart = 1;

        while (countStart <= numbertoStop){
        System.out.print(countStart + ", ");
        countStart ++;

        }
    }
}
