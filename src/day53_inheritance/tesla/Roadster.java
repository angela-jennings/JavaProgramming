package day53_inheritance.tesla;

//when we create object of a sub/child class, java first creates object of parent/super class
//while creating object of parent class, java runs constructor of parent class, then the child class constructor is executed
public class Roadster extends ElectricCars {

    public Roadster(double price, int year, int range) {
        super("Tesla", "Roadster", price, year, range);
    }
}
