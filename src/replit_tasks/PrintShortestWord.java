package replit_tasks;
import java.util.*;

public class PrintShortestWord {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] newStr = str.split(", ");
        String shortest = newStr[0];
for(String each : newStr){
    if(each.length() < shortest.length()){
        shortest = each;
    }
}
        //System.out.println(shortest);
String moreSmallest = "";
for(String each : newStr){
    if(shortest.length() == each.length()){
        moreSmallest +=each + ", ";
    }
}
       // System.out.println(moreSmallest);

String[] printWords = moreSmallest.split(", ");
Arrays.sort(printWords);
        System.out.println(Arrays.toString(printWords));


    }
    }

