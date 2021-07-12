package day61_exceptions_collections.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Thread.sleep(5000); causes/throws and InterruptedException which is a checked exception.
         * Can handle using try/catch
         * Can handle by "declaring"
         * --> using throws keyword after main method (or method signature)
         */
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(5000);
    }
}
