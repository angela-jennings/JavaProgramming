package extra_tasks;

import java.util.ArrayList;

public class UpperLowerCaseArrayList {
    public static void main(String[] args) {

    }

//    Get Uppercase or LowercaseThe method will accept a String and a boolean. -If the given boolean is true, then extract all the uppercase letters and return them in an ArrayList. -If the given boolean is false, then extract all the lowercase letters and return them in an ArrayList@param str -Given String@param isUpper-Given boolean@return -
//    java.util.ArrayList of Strings

    public static ArrayList<String> upperOrLower (String word, boolean isUpper){
        word.toCharArray();
       ArrayList<String> newArr = new ArrayList<>();
       for(int i = 0; i<word.length(); i++){
           if(isUpper == true && word.charAt(i)> 40 && word.charAt(i) < 91){
               newArr.add(word);

           }
       }
        return newArr;
    }
}
