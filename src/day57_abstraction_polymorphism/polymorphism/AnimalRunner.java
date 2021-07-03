package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal(); //not polymorphism - creating object of animal using animal class
        animal.makeNoise();

        //parent type = new child type
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal horse1 = new Horse();
        dog1.makeNoise();
        cat1.makeNoise();
        horse1.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());
        //polymorphic list of class Animal
        //objects in list can be any child of animal class
        for(Animal each : listOfAnimals){
            each.makeNoise();
        }


    }
}
