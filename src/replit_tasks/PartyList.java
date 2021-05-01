package replit_tasks;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputName = "";
        String name = "Please enter guest name: ";
        String newName = "Do you want to enter new guest name: ";

        System.out.println(name);
        inputName = scan.next();
        System.out.println(newName);
        String answer = scan.next();

        if (answer.equals("no")) {
            System.out.println("Guest's list: " + inputName);
        } else {
            while (answer.equals("yes")) {
                System.out.println(name);
                inputName = inputName + ", " + scan.next();
                System.out.println(newName);
                answer = scan.next();

            }
            System.out.println("Guest's list: " + inputName);

        }

    }}





/**
 String name = "Please enter guest name:";
 String newName = "Do you want to enter new guest name:";
 boolean answerIsYes;

 System.out.println(name);
 String inputName = scan.next();
 System.out.println(newName);
 String answer = scan.next();
 while (answer.equals("yes")) {
 answerIsYes = true;
 System.out.println(name);
 inputName = inputName + ", " + scan.next();


 if(answerIsYes){
 System.out.println(newName);
 scan.next();
 if (!answerIsYes) ;
 break;

 }
 }
 System.out.println("Guest's list: " + inputName );

 }
 }

 **/