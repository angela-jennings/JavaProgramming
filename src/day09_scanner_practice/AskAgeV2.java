package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner askAge = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = askAge.nextInt();
        System.out.println(age + " - That's a great age!");

    }
}
