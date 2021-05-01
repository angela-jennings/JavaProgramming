package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Civic";
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0));

        System.out.println(word + " in reverse is: " + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        String wordOne = ("" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        System.out.println(word + wordOne);

        if(word.equalsIgnoreCase(wordOne)){
            System.out.println("word is a palindrome");
        }else{
            System.out.println("word is not a palindrome");
        }

    }
}
