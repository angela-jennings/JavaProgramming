package replit_tasks;
import java.util.*;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int reverse = 0;
        int remainder;
        int originalNum = num;

        while(num != 0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        if(originalNum == reverse){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}

