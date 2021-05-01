package replit_tasks;

import java.util.*;

public class Zombie {
    /* A variable inhabitants represents a city and its respective populations. City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population. Write a program to loop the city population and make it lose half of its population until population is zero. Print the each day like below for each day:*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        int days = 0;
        System.out.println("Day " + days++ + " " + Arrays.toString(inhabitants));

        while(!Arrays.equals(inhabitants, new int[inhabitants.length])){
            int[] tempArray = Arrays.copyOf(inhabitants, inhabitants.length);

            for(int i = 0; i<inhabitants.length; i++){
                if(inhabitants[i] != 0){
                    tempArray[i] = tempArray[i]/2;
                }
            }
            inhabitants = Arrays.copyOf(tempArray, tempArray.length);
            System.out.println("Day " + days++ + " " + Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");

    }
}
