package office_hours.Practice_No_Dates;
import java.util.*;
public class MultipleWords {/* GivenaStringofwords that are separate by commas. Find and print any words that have more than one wordExampleInput: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer”Output: wooden spoonstrash candish washer*/

    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] newWords = words.split(", ");
        System.out.println(Arrays.toString(newWords));
        String doubleWord = "";
        for(String eachWord : newWords){
            if(eachWord.contains(" ")){
                doubleWord += eachWord + " ";
                System.out.print(eachWord + ", ");

            }
        }
        System.out.println();
        int n = 0;
        String[] days = {"sun", "mon", "wed", "sat"};

      int [] arr = {1, 2, 3, 4};
      int i = 0;
      do{
          System.out.println(arr[i] + " ");
          i++;
      }while (i < arr.length-1);
    }
}
