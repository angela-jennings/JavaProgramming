package day13_conditional_statements;
import java.util.Scanner;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

        System.out.println("if you're hungry, type \"true\", otherwise, type false");
        Scanner scan = new Scanner(System.in);
        boolean isHungry = scan.nextBoolean();

        if(isHungry==true){
            System.out.println("GIMME PIZZAAAAAA!!!!");
        }else{
            System.out.println("eat pizza anyways. it is always pizza time");
        }

        double price = 330.44;
        boolean isAffordable = price <= 200; //200 is budget
        System.out.println("isAffordable = " + isAffordable);

        if(isAffordable){
            System.out.println("you can afford this");
        }else{
            System.out.println("you cannot afford this");
        }

        boolean isRemoteJob = false;
        if(isRemoteJob){
            System.out.println("I am interested in the job");
        }else{
            System.out.println("I am not interested in the job");
        }



    }

}
