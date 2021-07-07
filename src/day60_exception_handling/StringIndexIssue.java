package day60_exception_handling;

import java.util.Locale;

public class StringIndexIssue {
    public static void main(String[] args) {
        String word = "java";
        try {
            System.out.println("word = " + word);
            System.out.println(word.charAt(10));
        }  catch (Exception e) {
            System.out.println("Catch happened");
            System.out.println("Reason = " + e.getMessage()); //prints reason for catch
        }
        System.out.println(word.toUpperCase());

        String word2 = "Selenium";
        try {
            System.out.println("word2 = " + word2);
            System.out.println(word2.substring(0,5));
            System.out.println(word2.substring(0,15));
        } catch (StringIndexOutOfBoundsException exc) {
            System.out.println("exc = " + exc);
            System.out.println(word2.length()-1);
        }
        System.out.println(word2.toUpperCase());

    }
}
