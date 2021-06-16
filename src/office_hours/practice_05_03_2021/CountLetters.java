package office_hours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "selenium", "word"));
        char targetLetter = 'a';
        int count = 0;

        for (String each : words){
            for(int i = 0; i < each.length(); i++){
               if(each.charAt(i) == targetLetter){
                   count ++;
               }
            }
        }
        System.out.println(targetLetter + " was found " + count + " times");
    }


}
