package day61_exceptions_collections.custom_exceptions_examples;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(){}
    public InsufficientFundsException(String message){
        super(message);
    }
}
