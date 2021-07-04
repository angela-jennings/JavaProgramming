package day58_polymorphism.SuperManExamples;

public class SuperMan extends Father implements Worker{
    @Override
    public void work(String job) {
        System.out.println("Superman is working as a " + job);
    }

    @Override
    public double getPaid() {
        System.out.println("Superman has a salary of: ");
        return 100_000;
    }
}
