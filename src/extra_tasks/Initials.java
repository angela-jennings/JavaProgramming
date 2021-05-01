package extra_tasks;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.next();
        System.out.println("Enter last name");
        String lastName = scan.next();

        System.out.print("Your initials are: " + firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase());


    }
}
/* [Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB*/