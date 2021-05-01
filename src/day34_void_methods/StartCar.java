package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
    sitInCar();
    startTheCar();
    shiftToDrive();
    pressGasPedal();
    }
    public static void sitInCar(){
        System.out.println("Open the door and sit in the drivers seat");
    }
    public static void startTheCar(){
        System.out.println("Turn the key in the ignition and start your car");
    }
    public static void shiftToDrive(){
        System.out.println("Put your foot on the brake, shift into drive, drive away");
    }
    public static void pressGasPedal(){
        System.out.println("Press the pedal to the metal babbyyyyyyy");
    }
}
