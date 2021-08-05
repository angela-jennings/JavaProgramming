package office_hours.practice_07_19_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortEachPart {
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        System.out.println(sortEach(str));

    }

    public static String sortEach(String str){
        //Queue<String> eachSub = new PriorityQueue<>();
        String fixedStr = "";
        ArrayList<String> eachSub = new ArrayList<>();


        for(int i = 0; i < str.length(); i++){

            char eachChar = str.charAt(i);
            eachSub.add("" + eachChar);
            boolean nextSubString = false;

            if(Character.isLetter(eachChar)){
                //if we are here, it means char at i is character
                if(i == str.length() -1 || !Character.isLetter(str.charAt(i + 1))){
                    //next char is a number, do some action
                    nextSubString = true;
                }
            }else{
                //if we are here, it means char at i is digit
                if(i == str.length() -1 || !Character.isDigit(str.charAt(i + 1))){
                    //if here, next char is not a digit
                    nextSubString = true;
                }
            }
            if(nextSubString){
                Collections.sort(eachSub); //if using queue, you dont need this line because priority queue sorts automatically
                fixedStr += String.join("", eachSub);
                eachSub.clear();
            }
        }
        return fixedStr;
    }
}
