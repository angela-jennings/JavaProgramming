package office_hours.practice_04_19_2021;

public class MethodClassTest {
    public static void main(String[] args) {
        MethodClass.methodOne(); //this only prints because it is a void method. returns the action from methodOne
        System.out.println(MethodClass.methodTwo()); //needs to be printed because otherwise the return value isnt used
        String s = MethodClass.methodTwo(); //can also store it into another variable

        System.out.println(MethodClass.methodThree("java"));


    }
}
