package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        //indexOf() string method
        // searches for a string and returns index position number

        String word = "buddy";
        System.out.println(word.indexOf("b"));
        //will return first occurrence if there are multiple of the same letter

        String word1 = "koga";
        System.out.println(word1.indexOf("g"));//2
        System.out.println(word1.indexOf("a"));//3
        System.out.println(word1.indexOf("koga"));// -1.. if you get neg 1 it means there is an error



    }
}
