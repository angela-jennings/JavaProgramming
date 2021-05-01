package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for(int i = 0; i<letters.length; i++) {
            System.out.print(letters[i]); //long way
        }
        System.out.println();
        for(char each : letters){
            System.out.print(each); //short way
        }
        String sentence = new String (letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray);
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        String allFruits = "";
        for(String each : fruits){
            System.out.print(each + " - ");
            allFruits += each + " - ";
        }

        System.out.println("\nall fruits = " + allFruits);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));

        String joinedLanguages = String.join("!!!", languages);
        System.out.println(joinedLanguages);


    }
}
