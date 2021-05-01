package day09_scanner_practice;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your temperature in Fahrenheit? ");
        double tempF = scan.nextDouble();
        double tempC = (tempF-32)*5/9;
        System.out.println("\nYour temperature in Celcius is: " + tempC);
    }
}
