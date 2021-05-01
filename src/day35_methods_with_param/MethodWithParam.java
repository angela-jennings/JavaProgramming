package day35_methods_with_param;

public class MethodWithParam {
    public static void main(String[] args) {
        displayValue(15);
        displayValue(25);
        displayValue(666);
        int count = 55;
        displayValue(count);

        greetByName("Angela");
        greetByName("Koga");
    }

    public static void displayValue(int num) {
        System.out.println("number = " + num);
        if (num == 666) {
            System.out.println("HAIL SATAN");
        }
    }

    public static void greetByName(String name){
        System.out.println("Hello, " + name + ", how are you today?");
    }
}
