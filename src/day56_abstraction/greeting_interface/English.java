package day56_abstraction.greeting_interface;

public class English implements Greeting {

    @Override
    public void hi() {
        System.out.println("Hello!");
    }

    @Override
    public void bye() {
        System.out.println("Goodbye");
    }
}
