package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.min(50, 25));
        System.out.println(Integer.sum(100, 200));
        System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("min double - " + Double.MIN_VALUE);
        System.out.println("max double - " + Double.MAX_VALUE);
        System.out.println(Double.max(56.23, 565.23));

        System.out.println(Double.compare(5, 1)); // first value is larger so result is 1
        System.out.println(Double.compare(5, 5)); //first value is equal to second value so result is 0
        System.out.println(Double.compare(5, 45)); // first value smaller than second value so result is -1


        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isDigit('6'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        char letter = 'a';
        if(Character.isLetter(letter)){
            System.out.println("you bet thats a letter");
        }
        if(Character.isLowerCase(letter)){
            System.out.println("youre darn right thats a lowercase letter");
        }

        String word = "JaVa Is FuN";
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i) + " ");
            }
        }
    }
}
