package replit_tasks;
import java.util.*;
public class CopyCertainValuesMethodReturn {
    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two", "three", "four"};
        System.out.println(Arrays.toString(getWithE(arr)));

    }

    public static String[] getWithE(String[] arr) {
        int count = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i].contains("e")) {
                count++;
            }
        }
            String[] fewValues = new String[count];
        int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains("e")) {
                    fewValues[index] = arr[i];
                    index++;
                }
            }


            return fewValues;
        }
    }




