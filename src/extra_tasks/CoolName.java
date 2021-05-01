package extra_tasks;
import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name to find out if it's cool or not");
        String name = scan.nextLine();

        if(name.startsWith("a") || name.startsWith("z")){
            System.out.println("Your name is cool");
        }else if(name.endsWith("m")){
            System.out.println("Almost Cool");
        }else{
            System.out.println("Sorry, not a cool name");
        }


    }
}
/* [Cool Name]

Declare a variable name. You will check if it is a cool name.
    - If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
    - If the name ends with 'm' print "Almost cool"
    - Otherwise print “Sorry not a cool name”*/