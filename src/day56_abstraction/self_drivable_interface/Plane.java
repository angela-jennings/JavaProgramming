package day56_abstraction.self_drivable_interface;

import day56_abstraction.greeting_interface.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void takesYouSomewhere() {
        System.out.println("Planes take you places much faster than a car");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Planes cost roughly $25 per mile. Total trip cost = " + mile*25 + ".");
    }

    @Override
    public void hi() {
        System.out.println("Hello from an airplane");
    }

    @Override
    public void bye() {
        System.out.println("Goodbye from an airplane");
    }
}
