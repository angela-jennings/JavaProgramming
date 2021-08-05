package office_hours.practice_07_27_2021;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {
    public static void main(String[] args) {
        frequencyTest("apple");
        frequencyTest("helloHowAreYou");
        frequencyTestTwo("applesAndBananas");
    }

    public static void frequencyTest(String str){
        //to keep insertion order, use LinkedHashMap
        Map <Character, Integer> frequency = new LinkedHashMap<>();
        //using hashMap will not keep insertion order
        //using treeMap will give alphabetical order

        for (Character each : str.toCharArray()) {
            if(frequency.containsKey(each)) {
                frequency.put(each, frequency.get(each) +1);
            }else{
                frequency.put(each, 1);
            }
        }
        System.out.println(frequency);
    }

    public static void frequencyTestTwo(String str) {
        Map <Character, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if(!frequency.containsKey(key)){
                frequency.put(key, 0);
            }
            frequency.put(key, frequency.get(key) +1);
        }
        System.out.println(frequency);
    }
}
