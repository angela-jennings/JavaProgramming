package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(123);
        main("Hello", "World");
    }
    public static void main(int num){
        System.out.println("num = " + num);  //overloading main method - still need to call in regular main method for anything to print
        main(1234);
    }
    public static void main (String word, String word2){
        System.out.println(word + " " + word2);
    }
}
