package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital"));  //true
        System.out.println(company.contains("l O")); //true because l space then o
        System.out.println(company.contains("o n e")); //false because of spaces

        //contains is case sensitive - must be exact unless using toUpper or toLower

        if(company.contains(" ")){
            System.out.println("multiple word company");
        }else{
            System.out.println("single word company");
        }

        String etsyTitle = "Wooden Spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("correct etsy title");
        }else{
            System.out.println("incorrect etsy title");
        }

        String firstName = "angela";
        if(firstName.contains("a") && firstName.contains("l")){
            System.out.println("both \"a\" && \"l\" are present");
        }else{
            System.out.println("correct letters not present");
        }

        if(firstName.contains("n") || firstName.contains("b")){
            System.out.println("name contains at least one required letter");
        }else{
            System.out.println("correct letters are not present");
        }

        String email = "angela@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("correct email format");
        }else{
            System.out.println("incorrect email format");
        }

        if(email.toLowerCase().contains("z")) {
            System.out.println("good job, you entered your email correctly");
        }else if(email.toUpperCase().contains("c")){
                System.out.println("again, good job");
            }else{
                System.out.println("do you not know how to type");
            }
        }
    }

