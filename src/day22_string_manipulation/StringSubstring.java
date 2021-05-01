package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.substring(startIndex, endIndex)
         */
        System.out.println(word.substring(0,3)); //prints jav
        System.out.println(word.substring(0,4)); //prints java - space is recognized at index 4 but end index is not printed
        System.out.println(word.substring(0)); //prints whole string

        String betterWord = "Koga is a stinky little whiney floof monster";
        System.out.println(betterWord.length());
        System.out.println(betterWord.substring(0, 44));

        System.out.println(betterWord.substring(8)); //starts with index 8 and runs through the end


    }
}
