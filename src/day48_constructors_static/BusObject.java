package day48_constructors_static;

public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Angela");
        bus.engine = new Engine(5);
        System.out.println(bus);
        System.out.println("---------------------------");
        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Frank");
        metroBus.engine = new Engine(10);
        System.out.println(metroBus);
        System.out.println("---------------------------");
        System.out.println("Bus driver one = " + bus.driver.getName() + "\nBus driver two = " + metroBus.driver.getName());

    }
}
