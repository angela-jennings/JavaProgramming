package office_hours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;
        while(temp!=0){
            int lastDigit = temp%10;
            reverse = reverse*10 + lastDigit;
            temp/=10;
        }
        return reverse == number;
    }
}
