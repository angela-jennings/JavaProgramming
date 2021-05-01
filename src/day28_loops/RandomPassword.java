package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_";
        Random random = new Random(); //helps generate randdom number
        String password = "";
        for(int pw = 1; pw<=8; pw++ ){ //pw repeats from 1 - 8 and increases by 1
            int index = random.nextInt(71); //random number 0 -70
            System.out.print(source.charAt(index));
            //source.substring(index, index+1);
            password += source.charAt(index); //because password was blank, you need to use += aka password = password + charAt(index) which happens every time for whatever limit is set. in this case the limit is less than or equal to 8
        }
        System.out.println("\nYour password = " + password);

    }
}
