package replit_tasks;
import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        for (int i = 0; i < word.length(); i++) {
            char vowel = word.charAt(i);
            if(vowel=='a' ||
               vowel=='e' ||
                    vowel == 'i' ||
                    vowel == 'o'||
                    vowel == 'u'){
            System.out.print(vowel);
        }
    }}}



