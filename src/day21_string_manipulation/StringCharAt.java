package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "athena";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));

        String company = "Cybertek";
        System.out.println("company = " + company.charAt(0));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh + " " + eighth);
        //C y b e r t e k

        String withSpaces = first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh + " " + eighth;

        System.out.println("withSpaces = " + withSpaces);

        String word1 = "mom";
        char first1 = word1.charAt(0);
        char last1 = word1.charAt(2);

        if(first1 == last1){
            System.out.println(word1 + " first and last letters match");
        }else{
            System.out.println("first and last letters do not match");
        }

        if(word1.charAt(0) == word1.charAt(2)){
            System.out.println("These letters match dang it");
        }else{
            System.out.println("those god damn letters dont match");
        }

        String anotherWord = "aziza";
        char firstLetter = anotherWord.charAt(0);
        char lastLetter = anotherWord.charAt(anotherWord.length()-1);
        if(anotherWord.charAt(0) == anotherWord.charAt(anotherWord.length()-1)){
            System.out.println("this word starts and ends with the same letter");
        }



    }
}
