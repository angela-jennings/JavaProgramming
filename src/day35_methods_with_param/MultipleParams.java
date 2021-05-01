package day35_methods_with_param;
import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers with decimal points");
        //double d1 = scan.nextDouble();
        //double d2 = scan.nextDouble();
        //showSum(d1, d2);
        showSum(15, 23.5);
        showSum(123.98, 456.23);


        buildEmail("Angela Jennings", "google");
    }
    public static void showSum(double num1, double num2){
        double sum = num1+num2;
        System.out.println(sum);
    }

    public static void buildEmail(String name, String domain){
        name = name.replace(" ","_").toLowerCase();
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);
        }

    }


