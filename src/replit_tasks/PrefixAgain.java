package replit_tasks;
import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        boolean isPrefix;
        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        if(remaining.contains(prefix)) {
            isPrefix = true;
            System.out.println(isPrefix);
        }else{
            isPrefix = false;
            System.out.println(isPrefix);
        }
            /**
             *         String str = "abXYabc";
             *         int n = 2;
             *
             *         String prefix = str.substring(0,n); // 0, 2 -> ab
             *         String remaining = str.substring(n);  // XYabc
             *
             *         System.out.println(remaining.contains(prefix));
             */

    }
}
/* Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.*/