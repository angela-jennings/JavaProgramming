package day59_polymorphism_exception_handling.exception_handling;

public class Swallowing {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            System.out.println(5/0);
        } catch (Exception ignore){}
        System.out.println("How are you today?");
        System.out.println("We just suppressed/swallowed the Runtime Exception");
        System.out.println("Error is not reported, we just ignore it.");
    }
}
