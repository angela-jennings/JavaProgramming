package day60_exception_handling;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Lets create exceptions");
        //RuntimeException e = new RuntimeException();
        //throw e;
        String userName = "";
        if(userName.isEmpty()) {
            throw new RuntimeException("Username cannot be empty");
        }
    }
}
