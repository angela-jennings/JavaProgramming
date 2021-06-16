package office_hours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        {
            ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "selenium", "word"));
            String targetWord = "java";
            int count = 0;

            for (String each : words){
                if(each.equals(targetWord)){
                    count ++;
                }
            }
            System.out.println(targetWord + " is present " + count + " times");
        }


    }
}
