package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(666);
        main("Hail", "Satan");
    }
    public static void main(int num){
        System.out.println("num = " + num);  //overloading main method - still need to call in regular main method for anything to print
    }
    public static void main (String word, String word2){
        System.out.println(word + " " + word2);
    }
}
