package office_hours.Practice_05_25_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 5, 4, 9));
        System.out.println(removeDup(list));
    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        ArrayList<Integer> unique = new ArrayList<>();
        String checked = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            if (!checked.contains("" + list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }
                if (count == 1) {
                    unique.add(list.get(i));
                }
            }

            checked += list.get(i) + " ";

        }
    return unique;
    }

    public static ArrayList<Integer> removeDup2 (ArrayList<Integer> list){
        list.removeIf(e -> Collections.frequency(list, e) > 1);
        return list;
    }
}
