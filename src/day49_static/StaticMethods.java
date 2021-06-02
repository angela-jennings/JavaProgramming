package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message - " + message);
        //System.out.println("num - " + num); //ERROR: num is an instance variable, static cannot access
        System.out.println("count - " + count); //no error - count is a static variable
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spood");
    }

    //StaticMethods.instanceMethod(); --> doesn't work
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod(); --> now this works because an object was created

    public void instanceMethod(){
        System.out.println("instance method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("Hello from instance method");

    }
}
