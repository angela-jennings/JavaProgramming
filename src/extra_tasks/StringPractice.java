package extra_tasks;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "apple";
        String word2 = "banana";
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0,5));

        System.out.println("\nenter two words");
        String word3 = scan.next();
        String word4 = scan.next();
        System.out.println(word3.substring(1));
        System.out.println(word4.substring(0));
    }
}
/* Remove first and last]
Given two words. Print the first word without its first character then print the second word
without its last character.
Input:
apple
banana
Output:
pple
banan
----------------------*/