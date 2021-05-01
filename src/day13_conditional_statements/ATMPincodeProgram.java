package day13_conditional_statements;
import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("****Welcome to Summit Credit Union!****\nPlease enter your pincode:");
        int secretPincode = 1234;
        int inputPincode = scan.nextInt();

        if(secretPincode==inputPincode){
            System.out.println("Welcome to your account\nYou can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pincode\nPlease try again");
        }
    }
}
