package replit_tasks;
import java.util.*;

public class DoSwitchArrayMethod {
    public static void main(String[] args) {
        int [] arr = {7,2,3,5};
        Arrays.toString(do_switch(arr));
        System.out.println(Arrays.toString(do_switch(arr)));
    }


    public static int[] do_switch(int[] i) {
        int[]newArr = new int [i.length];

        newArr[0] = i[3];
        newArr[1] = i[1];
        newArr[2] = i[2];
        newArr[3] = i[0];

        return newArr;
    }

}

