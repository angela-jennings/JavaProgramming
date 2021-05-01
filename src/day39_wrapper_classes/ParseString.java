package day39_wrapper_classes;
import java.util.*;

public class ParseString {
    public static void main(String[] args) {
        String total = "666";
        int hailSatan = Integer.parseInt(total);
        System.out.println(hailSatan);

        String strPrice = "99.98";
        double dblPrice = Double.parseDouble(strPrice);
        if(dblPrice<100){
            System.out.println("cheap");
        }else{
            System.out.println("expensive");
        }

        String sentence = "I wrote 100 lines of java code";
        //System.out.println(sentence.indexOf("100"));
        int linesOfCode = Integer.parseInt(sentence.substring(8,11));
        System.out.println(linesOfCode);

        String sentence2 = "I wrote 666 lines of java code";
        String[] newSentence = sentence2.split(" ");
        int newLinesOfCode = Integer.parseInt(newSentence[2]);
        System.out.println(newLinesOfCode);
        newLinesOfCode = 1000;
        System.out.println(newLinesOfCode);

    }
}
