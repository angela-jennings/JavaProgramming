package day56_abstraction.self_drivable_interface;

import day56_abstraction.greeting_interface.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void takesYouSomewhere() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * .10) + " per mile");
    }

    @Override
    public void hi() {
        System.out.println("Hello from a Tesla");
    }

    @Override
    public void bye() {
        System.out.println("Goodbye from a Tesla");
    }
}
