package office_hours.practice_05_11_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "two"));

        System.out.println(findIndex(list, "two"));
        System.out.println(findIndex(list, "two", 2));

    }

    /**
     * overloading findIndex method
     * @param words - list of elements given
     * @param element - the element we are looking for
     * @param startIndex - index where you want to start looking for given element
     * @return - method returns index where element is present in the array list, returns -1 if element is not present
     */
    public static int findIndex (ArrayList<String> words, String element, int startIndex){
        int index = -1;

        for(int i = startIndex; i < words.size(); i++){
            if(words.get(i).equals(element)){
                index = i; //could also return i;
                break;
            }
        }
        return index;
    }
    public static int findIndex (ArrayList<String> words, String element){
        int index = -1;

        for(int i = 0; i < words.size(); i++){
            if(words.get(i).equals(element)){
                index = i; //could also return i;
                break;
            }
        }
        return index;
    }
}
