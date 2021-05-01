package extra_tasks;
import java.util.Scanner;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3");
        int num3 = scan.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All integers are the same");
        }else if(num1>num2 && num1>num3){
            System.out.println("Number 1 is the biggest");
        }else if(num2>num1 && num2>num3){
            System.out.println("Number 2 is the biggest");
        }else if(num3>num1 && num3>num2){
            System.out.println("Number 3 is the biggest");
        }
        }

    }



/*Write a program that will ask the user to enter three numbers.
        If the numbers are the same print “All integers are the same”
        If they are not equal, print which is the biggest value of the three numbers
        —> If there is two numbers which are the largest print the one that came first
        > Input: 3,2,6
        > Output: The biggest number from 3, 2 and 6 is: 6*/
