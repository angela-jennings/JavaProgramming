package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main (String[] args){
        int toyotas = 431;
        int hondas = 233;
        int volkswagon = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInPark = (toyotas+hondas+volkswagon+tesla+nissan+bmw);

        System.out.print("Total cars in parking lot = ");
        System.out.println(toyotas+hondas+volkswagon+tesla+nissan+bmw);

        System.out.println("There are " +totalCarsInPark+ " cars in the parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        //there are 2 slices per person

        System.out.println(slicesPerPerson);
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices. "
                + people + " people ate " + slicesPerPerson + " pieces each.");






    }
}
