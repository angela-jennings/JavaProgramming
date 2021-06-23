package day56_abstraction.self_drivable_interface;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.bye();
        tesla.cost(24);
        tesla.hi();
        tesla.takesYouSomewhere();
        tesla.start();
        tesla.stop();

        Plane plane = new Plane();
        plane.bye();
        plane.hi();
        plane.cost(500);
        plane.takesYouSomewhere();
        plane.start();
        plane.stop();

    }
}
