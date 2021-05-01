package day32_arrays_split;
import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java-python-selenium-html";
        String[] wordsArray = words.split("-");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("indexes in wordsArray = " + wordsArray.length);

        for(String each: wordsArray) {
            System.out.println(each);
        }
            String sentence = "Today i am going to code java arrays";
            String[] sentenceArray = sentence.split(" "); //need to store in an array

            System.out.println("words in sentence = " + sentenceArray.length);

            for(String each : sentenceArray){
                System.out.println(each);
            }

    }
}