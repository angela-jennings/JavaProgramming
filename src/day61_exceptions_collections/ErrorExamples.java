package day61_exceptions_collections;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverflowError
        myMethod();
        //would never try/catch a stack overflow error. it is possible, but stackoverflow comes from buggy code
    }

    static int counter = 0;
    public static void myMethod() {
        System.out.println(counter++);
        myMethod();
    }
}