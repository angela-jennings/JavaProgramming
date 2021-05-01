package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.add(12.10, 10.58));
        System.out.println(Calculator.divide(89, 65));
        System.out.println(Calculator.multiply(98.65, 56.23));

        double d1, d2, result;
        d1 = 44.2;
        d2 = 22.3;
        result = Calculator.multiply(d1, d2);
        System.out.println("result = " + result);
    }
}
