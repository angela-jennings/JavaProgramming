package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("Full name = " + fullName());
        System.out.println("Is " + fullName() + " married? " + isMarried());
        System.out.println("How old is " + fullName() + " ? " + fullName() + " is " + getAge());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);

        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }

        System.out.println("Random year before 2021 = " + getRandomYear());

    }

    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }


    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
