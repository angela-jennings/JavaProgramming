package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Scion");
        System.out.println(myCar.getModel());
        myCar.setYear(2005);
        System.out.println(myCar.getYear());
        myCar.setMileage(212_000);
        System.out.println(myCar.getMileage());
        System.out.println(myCar.toString()); //is a special method that exists in each and every object. it is normally used to describe the object with assigned data. it converts each instance variable values into string and returns as 1 string value
        System.out.println();
        System.out.println(myCar); //automatically calls to string method. both ways call to string method, this way is just stored in the class with the other information.

        System.out.println();

        Car otherCar = new Car();
        otherCar.setModel("Subaru Forester");
        otherCar.setYear(2018);
        otherCar.setMileage(50_000);
        System.out.println(otherCar);
        System.out.println(otherCar.toString()); //gray because there is already the to string method in the class - doesnt actually use this instance of to string because it can call to the other to string method in the class
    }
}
