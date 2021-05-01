package extra_tasks;
import java.lang.instrument.ClassDefinition;
import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("enter two strings, must be at least 6 characters long");
String firstStr = scan.nextLine();
String secondStr = scan.nextLine();
if(firstStr.length()<6 && secondStr.length()<6){
    System.out.println("invalid data");
}
        System.out.print(firstStr.substring(0,4)+(secondStr.substring(secondStr.length()-3) + "@cybertek.com"));
        //System.out.print(secondStr.substring(secondStr.length()-1-1-1) + "@cybertek.com");

    }
}
/* [Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cybertek.com” and print the final string as your created email. The final email
should be in all lowercase.
input:
JamesBond
Secret
output:
jameret@cybertek.com
--------------------------------------------------------------------*/