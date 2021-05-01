package replit_tasks;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        for(long i = n-1; i>0; i--){
          n = n*i;
        }
        System.out.println(n);
    }
}
