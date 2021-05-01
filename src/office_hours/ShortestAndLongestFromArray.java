package office_hours;
import java.util.*;
public class ShortestAndLongestFromArray {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("How many words will you enter?");
        String[] words = new String[input.nextInt()];
        input.nextLine();
        for(int i = 0; i <words.length; i++){
            System.out.println("enter word: " + (i + 1));
            words[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(words));
        String[] smallAndLarge = {words[0], words[0]}; // this gives something to compare to. use first value in string as place holder to compare to
        // 0 = smallest ... 1 = largest

        for(String eachWord : words){
            if(eachWord.length() < smallAndLarge[0].length()){
                smallAndLarge[0] = eachWord;
            }
            if(eachWord.length() > smallAndLarge[1].length()){
                smallAndLarge[1] = eachWord;
            }
        }
        System.out.println("smallest element = " + smallAndLarge[0]);
        System.out.println("Largest element = " + smallAndLarge[1]);
    }
}
