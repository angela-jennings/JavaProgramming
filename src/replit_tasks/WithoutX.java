package replit_tasks;
import java.util.Scanner;
public class WithoutX {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if(word.substring(2).contains("java"))
            System.out.println("false");
        else if(word.substring(0).contains("java")) {
            System.out.println("true");
        }else if(word.substring(1).contains("java")) {
            System.out.println("true");


        }}}


