package day37_methods_overloading;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("angelajennings", "abc123");
        loginVoid("AngelaJennings", "ABC123");
        System.out.println(login("AngelaJennings", "abc123"));
        System.out.println(login("angelajennings", "ABC123"));
        if(login("AngelaJennings", "abc123")){
            System.out.println("Login successful. Welcome to Canvas");
        }else if (login("angelajennings", "abc123")) {
            System.out.println("Incorrect Username");
        }else if(login("AngelaJennings", "ABC123")){
            System.out.println("Incorrect Password");
        }

    }

    public static void loginVoid (String userName, String password) {
        String secretUserName = "angelajennings";
        String secretPassword = "abc123";
        if(secretUserName.equals(userName) && secretPassword.equals(password)){
            System.out.println("login successful");
        }else{
            System.out.println("incorrect username or password");
        }
    }


    public static boolean login (String userName1, String password1){
        String secretUserName1 = "angelajennings";
        String secretPassword1 = "abc123";
        if(userName1.equals(secretUserName1) && password1.equals(secretPassword1)){
         return true; // dont need else block because if condition is true, it will return true and exit
        }
        return false;
        // can also type as - return userName.equals(secretUserName) && password.equals(secretPassword);
        // above is shortest way to return true statement
    }


}
