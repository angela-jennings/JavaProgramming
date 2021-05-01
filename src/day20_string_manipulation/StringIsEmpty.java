package day20_string_manipulation;
import java.lang.*;


public class StringIsEmpty {
    public static void main(String[] args) {
        String word1 = "";
        System.out.println(word1.isEmpty()); //returns boolean
        System.out.println(word1.length()); //returns 0 because there is nothing in quotes
        System.out.println(word1.length() == 0); //returns boolean

        if(word1.isEmpty()){
            System.out.println("Word is missing, please resend");
        }else{
            System.out.println("word looks good");
        }

        if(word1.length()==0){
            System.out.println("word is empty, please enter word");
        }else{
            System.out.println("word looks great");
        }

        if("".isEmpty()){ //ture so it prints "its empty"
            System.out.println("is empty");
        }

        String veggie = "carrots";
        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }else{
            System.out.println("we have no " + veggie);
        }

    String password = "";
        if(password.isEmpty()){
            System.out.println("password is empty - please enter password");
        }else if(!password.isEmpty()){
            System.out.println("youve entered a password - good job");
        }

    }
}
