package office_hours.Practice_No_Dates;
import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //next() vs nextLine()
        //next() read a string value from the console . it only reads a single word. spaces separate words

        //nextLine() reads a string value from the console. it will read multiple words.
        //           -> also accepts the enter input

        System.out.println("enter a number");
        int num = scan.nextInt();
        System.out.println("Enter your full name");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println(num);
        System.out.println(name);




    }
}
