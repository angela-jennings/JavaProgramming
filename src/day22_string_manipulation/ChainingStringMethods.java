package day22_string_manipulation;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "Wooden Spoon";

        System.out.println(word.toUpperCase().toLowerCase()); //reads left to right - uppercase first but final print in lowercase
        System.out.println(word.toUpperCase().toLowerCase().length()); //again, left to right. final command is to give the length of word, which is 12

        String word1 = "woo den sp oon";
        System.out.println(word1.replace(" ", "").toUpperCase()); //first command is replacing space with no space, then change all characters to uppercase

        String city = "LoveLand";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        //reads first character at index 0, stops and index 1 - substring doesnt print ending index - assigning toUpperCase to first index. then, substring from index 1 and on change to lowecase
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        //assign the correct format to a new string
        System.out.println("capitalized = " + capitalized);

    }
}
