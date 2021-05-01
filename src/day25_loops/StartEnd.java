package day25_loops;
import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int start = scan.nextInt();
        System.out.println("Enter an ending number");
        int end = scan.nextInt();

        if(start>end){
            System.out.println("invalid");
        }

        for(int i = start; i <= end; i++) {
            System.out.println("i = " + i);

            }
        }}



