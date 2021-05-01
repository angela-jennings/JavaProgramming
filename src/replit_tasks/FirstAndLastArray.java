package replit_tasks;
import java.util.*;
public class FirstAndLastArray {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple", "note"};

        String[] newWords = new String [words.length];

        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[i].substring(0,1) + words[i].substring(words[i].length() - 1);
        }
        System.out.println(Arrays.toString(newWords));

    }
}
// System.out.print(words[0].charAt(0) + "" + words[0].charAt(words[0].length()-1));
