package replit_tasks;
import java.util.*;
public class ZombieAttack2 {
    public static void main(String[] args) {

        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int days = 0;
        System.out.println("Day " + days++ +  " " + Arrays.toString(inhabitants));

        while(!Arrays.equals(inhabitants, new int[inhabitants.length])){
            //while loop runs until a condition becomes false. useful when you arent sure how many iterations there will be in a loop
            int[] tempArray = Arrays.copyOf(inhabitants, inhabitants.length);

            for(int i = 0; i<inhabitants.length; i++){
                if(inhabitants[i] == 0){
                    if(i == 0){
                        tempArray[i + 1] = tempArray[i + 1]/2;
                    }else if(i == inhabitants.length-1){
                        tempArray[i - 1] = tempArray[i - 1]/2;
                    }else{
                        tempArray[i + 1] = tempArray[i + 1]/2;
                        tempArray[i - 1] = tempArray[i - 1]/2;
                    }
                }
            }
            inhabitants = Arrays.copyOf(tempArray, tempArray.length);
            System.out.println("Day " + days++ +  " " + Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
    }
}
