package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(10,10);
        sum(10.5, 10.5);
        sum(5, 15, 15);
        sum("6", "66");
    }
public static void sum(int one, int two){
        int sum = one + two;
    System.out.println(sum);
}
public static void sum(double one, double two){
        double sum = one + two;
    System.out.println(sum);
}
public static void sum(int one, int two, int three){
        int sum = one + two + three;
    System.out.println(sum);
}
public static void sum(String firstNumber, String secondNumber){
        String sum = firstNumber + secondNumber;
    System.out.println(sum);
}



}
