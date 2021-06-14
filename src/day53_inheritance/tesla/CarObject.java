package day53_inheritance.tesla;

import com.sun.javafx.collections.ImmutableObservableList;

public class CarObject {
    public static void main(String[] args) {
        ElectricCars car1 = new ElectricCars("Tesla", "Model Y", 52_490, 2021, 326);
        System.out.println(car1);
        car1.drive(50);
        car1.drive(400);

        ElectricCars car2 = new ElectricCars("Tesla", "Model X", 70_000, 2020, 300);
        System.out.println(car2);
        car2.drive(100);

        System.out.println(ElectricCars.getCount());

        Roadster car3 = new Roadster(80_000, 2022, 400);
        System.out.println(car3);
        car3.drive(250);

        String canIBuyCar = (car3.getPrice() <= 100000) ? "I can buy the car" : "I cannot buy the car";
        System.out.println(canIBuyCar);

        ModelX car4 = new ModelX(70_000, 2019, 350);
        System.out.println(car4);
        car4.drive(200);
        car4.getPrice();
        car4.getYear();

        System.out.println("ElectricCars.getCount() = " + ElectricCars.getCount());

    }
}
