package extra_tasks;
import java.util.Scanner;

public class IsATriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter angles for each side of triangle:");
        int angle1, angle2, angle3;
        System.out.print("Angle 1: ");
        angle1 = scan.nextInt();
        System.out.print("Angle 2: ");
        angle2 = scan.nextInt();
        System.out.print("Angle 3: ");
        angle3 = scan.nextInt();

       if((angle1+angle2+angle3)==180){
           System.out.println("You have a valid triangle");
       }else{
           System.out.println("You do not have a valid triangle");
       }
    }
}
