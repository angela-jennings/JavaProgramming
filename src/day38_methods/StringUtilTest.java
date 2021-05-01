package day38_methods;

import java.sql.SQLOutput;

import static day38_methods.StringUtils.isPalindrome; //imported palindrome method from class day_38
// can also import by --> import static day38_methods.StringUtils.*;

import static day38_methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("Username cannot be null or empty");
        }

        System.out.println("hello = " + StringUtils.isPalindrome("hello")); //if not importing, you need to call it as ClassName.methodName
        System.out.println("java = " + isPalindrome("java"));
        System.out.println("civic = " + isPalindrome("civic"));
        System.out.println("angela = " + isPalindrome("angela"));
        System.out.println("athena = " + isPalindrome("athena"));
        System.out.println("hannah = " + isPalindrome("hannah"));
        System.out.println("racecar = " + isPalindrome("racecar"));


        System.out.println(isReverse("Hello Hello Hello Koga Koga Koga"));
        String word = "I love Koga and Athena";
        System.out.println(isReverse(word));  //storing a word into a new variable and then calling isReverse method to see that variable backwards

        if(isReverse("civic").equals("civic")){
            System.out.println("word is palindrome");
        }
        if(isReverse("koga").equals("koga")){   //calling reverse method and comparing to the same word to see if its a palindrome or not
            System.out.println("word is palindrome");
        }else{
            System.out.println("word is not palindrome");
        }
    }
}
