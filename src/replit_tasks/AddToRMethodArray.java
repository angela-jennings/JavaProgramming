package replit_tasks;
import java.util.*;

public class AddToRMethodArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {2, 3, 5, 8};
        int n = 7;

        add_to_r(arr, n);
    }


    public static void add_to_r(int[] r, int n) {
        //create new array with one more position.
        int[] newArr = new int[r.length+1];
        newArr[newArr.length-1] = n;
        for(int i = 0; i< newArr.length-1; i++){
            newArr[i] = r[i];

        }

        System.out.print(Arrays.toString(newArr));


    }
}
