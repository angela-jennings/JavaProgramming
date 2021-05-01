package replit_tasks;
import java.util.*;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};

        System.out.print(words[0].charAt(0) + "" + words[0].charAt(words[0].length()-1));
        System.out.println();
        System.out.print(words[1].charAt(0) + "" +words[1].charAt(words[1].length()-1));
        System.out.println();
        System.out.print(words[2].charAt(0) + "" +words[2].charAt(words[2].length()-1));
        System.out.println();
        System.out.print(words[3].charAt(0) + "" +words[3].charAt(words[3].length()-1));
        System.out.println();
        System.out.print(words[4].charAt(0) + "" + words[4].charAt(words[4].length()-1));
        System.out.println();
    }
}
