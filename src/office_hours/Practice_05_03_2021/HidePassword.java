package office_hours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        String [] password = {"one", "apple", "hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for(String each: password){
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println("Original passwords " + Arrays.toString(password));
        System.out.println("New passwords " + hiddenPassword);
    }
//using a helper method - a method that does some action and its called from somewhere else
    public static String convertToStars(String str) {
        String stars = "";
        for (int i = 0; i < str.length(); i++) {
            stars += "*";
        }
    return stars;
    }
}