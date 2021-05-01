package extra_tasks;
import java.util.Locale;
import java.util.Scanner;

public class FindAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your address");
        String address = scan.nextLine();


        if(address.equals("")){
            System.out.println("no address found");
        }
        System.out.println(address.toUpperCase());

    }
}
/* A person will enter their address into a String. Make sure the String is not empty.
    If it is empty print: "No address found".
    If there is an address make all the text uppercase to match the expected format

        Ex:
            Input: 231332 leaf ave, lake city 3132
            Output: 231332 LEAD AVE, LAKE CITY 3132

        Ex:
            Input: ""
            Output: No address found*/