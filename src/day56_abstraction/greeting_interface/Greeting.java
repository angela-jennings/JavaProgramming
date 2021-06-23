package day56_abstraction.greeting_interface;

public interface Greeting {
    void hi(); //dont need to write as "public abstract void hi()" because compiler adds the public abstract automatically because it is an interface
    void bye();
}
