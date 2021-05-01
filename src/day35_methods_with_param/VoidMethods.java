package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
    for(int i = 0; i < 10; i++){
        printAtoZ();
        System.out.println();
        displayUsFlag();
    }

    displayUsFlag();

    }
    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }

    }

    public static void displayUsFlag() {
        System.out.println("---------------FLAG OF USA---------------");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
}
