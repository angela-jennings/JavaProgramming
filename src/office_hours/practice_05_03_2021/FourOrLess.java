package office_hours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourOrLess {
    //remove in ArrayList
    //remove(0);
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apples", "java", "tree", "cat", "animal", "shortcut"));

        //keep all 4 or less char words

        ArrayList<String> list2 = new ArrayList<>();

        for(String each : list){
            if(each.length()<=4){
                list2.add(each);
            }
        }
        System.out.println(list2);
    }
}
