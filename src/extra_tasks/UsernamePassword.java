package extra_tasks;

public class UsernamePassword {
    public static void main(String[] args) {
        String username = "ajenn118";
        String password = "1234";

        if (password.length() <= 4) {
            System.out.println("password cannot be less than 5 characters");
        } else if (password.length() > 4) {
            System.out.println("valid password");
            if (password.contains("ajenn118")) {
                System.out.println("password cannot contain username");
            }

        }
        System.out.println(password.replace("1234", "password"));


    }
}
/* Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
*/