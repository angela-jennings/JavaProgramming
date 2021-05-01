package day18_conditions_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int ssn = 1234;
        int pin = 1239;

        if(ssn==pin){
            System.out.println("Authentication passed");
        }else if(ssn != 1234){
            System.out.println("SSN does not match");
        }else if(pin != 1234){
            System.out.println("Pin does not match");
        }
    }
}
