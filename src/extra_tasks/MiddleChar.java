package extra_tasks;
import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();

    if(word.length()%2==0){
        System.out.print(word.charAt(word.length()/2-1));
        System.out.print(word.charAt(word.length()/2));
    }else if(word.length()%2!=0){
        System.out.print(word.charAt(word.length()/2));
    }
    }
}
/* [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph*/