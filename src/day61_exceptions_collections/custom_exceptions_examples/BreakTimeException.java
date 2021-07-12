package day61_exceptions_collections.custom_exceptions_examples;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message);
    }
}

