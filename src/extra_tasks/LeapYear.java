package extra_tasks;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to see if it is a leap year");
        int year = scan.nextInt();
        if(year%4==0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
