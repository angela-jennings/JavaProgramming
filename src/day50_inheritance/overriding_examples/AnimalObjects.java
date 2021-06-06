package day50_inheritance.overriding_examples;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalType = "Rat";
        animal.animalName = "Matilda";

        Cat cat = new Cat();
        cat.animalName = "Smokey";
        cat.animalType = "Feline";
        cat.speak();
        cat.jump();

        Dog dog = new Dog();
        dog.animalType = "Smelly Husky";
        dog.animalName = "Koga";
        System.out.println(dog.animalName + " is a " + dog.animalType);
        dog.run();
        dog.speak();



    }
}
