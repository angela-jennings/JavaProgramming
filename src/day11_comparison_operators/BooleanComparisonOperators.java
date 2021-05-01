package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10); //true because 10=10
        System.out.println(1000>100); //true because 1000 is greater than 100
        System.out.println(985.44<98547.8); //true because 985 is less than 98547
        System.out.println(10<=9); //false because 10 is not less than 9
        System.out.println(10>=9); //true because 10 is greater than 0
        System.out.println(10!=100); //true because 10 is not equal to 100

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean result;
        result = 5==5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);

        String city = "Loveland";
        System.out.println(city == "Loveland");
        System.out.println(city == "Fort Collins");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        System.out.println(name + checkName);

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);


    }
}
