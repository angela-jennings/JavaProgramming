package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversionMethods {
    public static void main(String[] args) {
        //toLowerCase() -> converts all letters to lowercase
        //toUpperCase() -> converts all letters to uppercase

        String word = "Java";
        System.out.println(word.toLowerCase()); //paranthesis are left empty - pulls from variable word
        System.out.println(word.toUpperCase());

        String word1 = "CyberTek";
        System.out.println(word1.toLowerCase());
        System.out.println(word1.toUpperCase());

        String wordInLCase = word.toLowerCase(); // changing variable word to always be in lowercase - converting
        System.out.println("wordInLCase = " + wordInLCase);

        String company = "Amazon";
        System.out.println(company.toUpperCase());


    }
}
