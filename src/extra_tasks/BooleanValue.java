package extra_tasks;
import java.util.Scanner;

public class BooleanValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter either true or false:");
        boolean answer = scan.nextBoolean();

        if(answer == true){
            System.out.println("False");
        }
        if(answer ==  false){
            System.out.println("True");
        }
    }
}
