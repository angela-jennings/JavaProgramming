package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajavaajavaava";
        String[] newWord = word.split("a");
        System.out.println(newWord.length); //length is 2
        int countOfA = newWord.length-1;
        if(word.endsWith("a")){ //if ends with a add one more
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        int count = 0;
        System.out.println("--------using split with empty space---------");
        newWord = word.split("");
        for(String each : newWord){
            if(each.contains("a")){
                count++;
            }
        }
        System.out.println(count);


        String word1 = "java1html2sql";
        String[] newWord1 = word1.split("\\d"); //splits at any digit
        System.out.println(Arrays.toString(newWord1));
    }
}
