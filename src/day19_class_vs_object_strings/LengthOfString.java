package day19_class_vs_object_strings;

import java.util.Locale;

public class LengthOfString {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.length());
        String word1 = "python";
        System.out.println(word.length() + word1.length());

        System.out.println("angela jennings".length());

        String password = "abc123456";
        /**if statement:
         * when password is at least 6 characters, print: valid amazon password
         * else
         * print: password is too short
         */

        if (password.length() >= 6) {
            System.out.println("Password is correct length");
        } else {
            System.out.println("Password is not long enough");
        }

        String countryCode = "USA";

        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail = case is incorrect");
        }

        String word2 = "java";
        String uword = word2.toUpperCase();
        String lword = word2.toLowerCase();
        System.out.println("word2 = " + word2);
        System.out.println("uword = " + uword);
        System.out.println("lword = " + lword);



    }
}
