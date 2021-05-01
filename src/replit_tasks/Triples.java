package replit_tasks;
import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "abYYXabXXYXXab";
        int count = 0 ;
        //WRITE YOUR CODE HERE

        for(int i = 0; i<str.length()-2; i++){
            char triple = str.charAt(i);
            if(triple == str.charAt(i) && triple == str.charAt(i+1) && triple == str.charAt(i+2)){
                count++;

            }
        }
        System.out.println(count);
    }
}
/* for(int i = 0; i<str.length()-2; i++){
            String triple = str.substring(i, i+3);
            if(triple.equals() {
                count++;

            }
        }*/
