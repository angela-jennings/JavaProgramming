package extra_tasks;
import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter to see if it is uppercase of lowercase");
        char letter = scan.next().charAt(0);

        if(letter <=64 && letter >122 && letter>=91 && letter <=97){
            System.out.println("invalid letter");
        }else if(letter >=65 && letter<=90){
            System.out.println("letter is uppercase");
        }else if(letter>=97 && letter<=122){
            System.out.println("letter is lowercase");
        }
    }
}
/* [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table*/