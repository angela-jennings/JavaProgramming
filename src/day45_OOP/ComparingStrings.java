package day45_OOP;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "koga"; //created in string pool
        String word2 = "koga";//points to the word1 because it already exists in pool
        String word3 = new String ("koga"); // using new keyword, new object is created and stored in heap memory
        String word4 = new String ("koga"); //creates another object in heap memory

        System.out.println(word1 == word2); //true, points to same object
        System.out.println(word1 == word3); //false, points to different objects
        System.out.println(word3 == word4); //false, points to different objects
        System.out.println(word1.equals(word3)); //true, values of actual characters are equal to one another
    }
}
