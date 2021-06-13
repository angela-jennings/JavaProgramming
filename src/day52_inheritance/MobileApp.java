package day52_inheritance;

public class MobileApp {
    String name;
    double version;

    public void useTheApp(int minutes){
        System.out.println("You have used the " + name + " app for: " + minutes + " minutes");
    }
}
