package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     Random random = new Random();
     int secretNumber = random.nextInt(100);
     int enteredNumber = 0;
     int attempts = 1;

     do{
         System.out.println("guess the secret number");
         enteredNumber = scan.nextInt();
         if (enteredNumber>secretNumber) {
             System.out.println("Too large");
         }else if(enteredNumber<secretNumber){
                 System.out.println("too small");
             }
     }while(secretNumber != enteredNumber);
        System.out.println("congratulations you won!");


        }

    }

