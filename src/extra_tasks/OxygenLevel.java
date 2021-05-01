package extra_tasks;

import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter oxygen level:");
        int oxygenLevel = scan.nextInt();

        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel < 90 && oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel < 80 && oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if (oxygenLevel < 70 && oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel < 60 && oxygenLevel > 50) {
            System.out.println("Be careful, now you are at 50%");
        } else if (oxygenLevel < 50) {
            System.out.println("You are almost out of oxygen");
        } else {
            System.out.println("Not a valid number");
        }

    }
}



/*[Oxygen level - If statements, operators]

        You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
        x
        > Above 90 - Your tank is full
        > Above 80 - Still okay
        > Above 70 - Don't go too far
        > Above 60 - Start to head back
        > Above 50 - Be careful now you at at 50%*/
