package day56_abstraction.greeting_interface;

public class Spanish implements Greeting {
    @Override
    public void hi() {
        System.out.println("Hola, buenos dias!");
    }

    @Override
    public void bye() {
        System.out.println("Adios, buenos noches!");
    }
}
