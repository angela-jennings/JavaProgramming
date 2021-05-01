package day26_loops;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number<1 || number>10){
            System.out.println("invalid number");
        }else{
            for (int i = 0; i <=10; i++){
                System.out.println(number + " multiplied by " + i + " = " + number*i);
            }
        }


    }
}
