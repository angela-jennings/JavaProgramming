package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.toUpperCase()); //nullPointerException if using a single pipe in method because single pipe will check all conditions - there is nothing to turn to uppercase after word is reassigned to null

        /*
           if you use --> if(word.isEmpty() || word == null ) <-- also get null pointer exception because word is defined as null but there is nothing to run when word.isEmpty() is first. always need to have null first
        */

        System.out.println(isNullOrEmpty(word));
        word = "";
        System.out.println(isNullOrEmpty(word));

        isPalindrome("java");
        isPalindrome("civic");

        System.out.println(isReverse("hello"));
    }

    public static boolean isNullOrEmpty(String str) {

        return (str == null || str.isEmpty()); //dont need if statement since return is true or false
//    if(str == null || str.isEmpty()){      //longer way of writing the same statement as above
//        return true;
//    }
//    return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true; //dont need to declare a boolean variable because the return is always boolean


    }

    public static String isReverse(String str){
        String newStr = "";
        for(int i = str.length()-1; i>=0; i--){
            newStr += str.charAt(i);    //assigning to a new variable. storing character at last index of string to new variable
        }
        return (newStr);
    }
}
