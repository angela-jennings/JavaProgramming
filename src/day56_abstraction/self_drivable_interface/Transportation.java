package day56_abstraction.self_drivable_interface;

public abstract class Transportation {
    public abstract void takesYouSomewhere();
    public abstract void cost (int mile);
    public void start() {
        System.out.println("Starting the engine");
    }
    public void stop() {
        System.out.println("Shutting off the engine");
    }
}
