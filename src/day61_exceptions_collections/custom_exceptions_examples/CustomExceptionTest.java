package day61_exceptions_collections.custom_exceptions_examples;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 50;
        System.out.println("Class is going on for " + minutes + " minutes");
        if (minutes > 50) {
            throw new BreakTimeException("It is break time!");
        }
        System.out.println("Lets continue class");

        double balance = 400;
        double itemPrice = 500;

        if(itemPrice > balance){
            throw new InsufficientFundsException("You don't have enough money");
        }else{
            System.out.println("Item successfully purchased");
        }
    }
}
