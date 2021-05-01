package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter price for milk \n$");
        double milk = scan.nextDouble();
        System.out.print("Enter price for bread \n$");
        double bread = scan.nextDouble();
        System.out.print("Enter price for cucumbers \n$");
        double cucumbers = scan.nextDouble();
        double total = milk+bread+cucumbers;
        System.out.println("Total purchase $" + total);


    }
}
