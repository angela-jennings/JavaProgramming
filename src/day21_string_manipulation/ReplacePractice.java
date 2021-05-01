package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub" , "lab"));
        System.out.println("word = " + word); // word stays github because word wasnt reassigned to gitlab

        word = word.replace("hub" , "lab"); //this method replaces github to gitlab
        System.out.println("word = " + word);
        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        System.out.println("sentence = " + sentence);
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);

        sentence = sentence.replace("java" , "selenium").replace("fun" , "a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for \"java book\"";
        System.out.println("result = " + result);
        result = result.replace("1-48 of over ", "").replace(" results for \"java book\"", "").replace(",","");
        System.out.println("result = " + result);


    }
}
