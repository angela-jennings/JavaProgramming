package day24_loops;
import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;
        int pincode;
        do{
            System.out.println("Enter pincode");
            pincode = scan.nextInt();
        }while(pincode != secretPincode);
            System.out.println("entered pincode correctly");

    }


    }

