package extra_tasks;
import java.util.Scanner;

public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper or lowercase? ");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("uppercase")){
            for(char i = 'A'; i<='Z'; i++){
                System.out.print(i);
            }}else if(answer.equalsIgnoreCase("lowercase")){
                for(char i = 'a'; i<='z'; i++){
                    System.out.print(i);
                }
            }

        }




    }

/* • Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z
• If it is lower: print the alphabet in all uppercase letter from a to z*/