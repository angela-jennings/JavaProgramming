package extra_tasks;
import java.util.Scanner;

public class FullTimePartTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary amount in whole dollars");
        int salary = scan.nextInt();
        System.out.println("Is this a full time position?");
        boolean fullTime = scan.nextBoolean();

        if(fullTime){
            System.out.println("Your new salary will be: " + (salary+20_000));
        }else{
            System.out.println("Your new salary will be: " +(salary-5_000));
        }

    }
}
