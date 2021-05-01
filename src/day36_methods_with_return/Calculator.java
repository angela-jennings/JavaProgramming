package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(66.6, 33.3));
        System.out.println(multiply(10.5, 3.75));
        System.out.println(divide(666, 111));
        System.out.println(remainder(125, 10));


    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum; //return num1+num2;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static int divide(int num1, int num2) {
        int sum = num1 / num2;
        return sum;
    }

    public static int remainder(int num1, int num2) {
        int sum = num1 % num2;
        if (sum == 0) {
            System.out.println("evenly divisible");
        }else{
            System.out.println("not evenly divisible");
        }
        return sum;

    }
}