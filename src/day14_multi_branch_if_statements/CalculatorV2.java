package day14_multi_branch_if_statements;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        char operator = scan.next().charAt(0);

        if (operator == '+'){
            System.out.print(num1 + num2);
        } else if (operator == '-'){
            System.out.print(num1 - num2);
        } else if (operator == '*'){
            System.out.print(num1 * num2);
        } else if (operator == '/'){
            System.out.print(num1/num2);
        }

        System.out.println(" = " + num1+operator+num2);
    }
}
