package day49_static;

public class StaticTest {
    static String word = "java";
    public static void main(String[] args) {
        //static method can be called using classname
        StaticMethods.displayMessage("Hello World");
        //instance method needs an object to be called
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //static method can only access other static variables and methods
        System.out.println(word); //this words because of the static keyword added before the variable type (String)

    }
}
