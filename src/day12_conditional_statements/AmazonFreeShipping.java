package day12_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        System.out.println("Enter total price");
        Scanner scan = new Scanner(System.in);
        double totalPrice = scan.nextDouble();

        if(totalPrice>=25.00){
            System.out.println("Free shipping eligible! Your order total = $" + totalPrice);
        }else{
            System.out.println("Not eligible for free shipping. Your order total is $" + totalPrice);
    }
 }
}
