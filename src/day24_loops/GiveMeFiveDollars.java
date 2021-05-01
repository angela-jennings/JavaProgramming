package day24_loops;
import java.util.Scanner;
public class GiveMeFiveDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollars = 0;
        while(dollars != 5){
            System.out.println("give me 5 bucks ya loser");
            dollars = scan.nextInt();
        }
        System.out.println("thanks for the fiver");
    }
}
