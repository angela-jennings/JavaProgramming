package office_hours.practice_07_19_2021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String duplicate1 = "AAABBBCCCD";
        String duplicate2 = "abcccddeeff";

        //if job interview task - ask, will there be both uppercase and lowercase and will there be specials characters. Ask if they have input in mind, or make something up

        //can use set, or can do it manually
        //can walk through using pseudocode

        //loop through each char, using nested loops compare with each other char in the string

        System.out.println(removeDuplicateChars(duplicate1));
        System.out.println(removeDuplicateChars(duplicate2));
    }

    public static String removeDuplicateChars(String str){
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        return set.toString().replace("[", "").replace(", ", "").replace("]", "");
    }
}
