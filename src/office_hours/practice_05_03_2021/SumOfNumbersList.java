package office_hours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumbersList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "24", "54"));

        for(int i = 0; i <list.size(); i++){
            int totalSum = 0;
            for(char digit : list.get(i).toCharArray()){
                totalSum += Integer.parseInt("" + digit);
            }
            list.set(i, "" + totalSum);
        }
        System.out.println(list);
    }
}
