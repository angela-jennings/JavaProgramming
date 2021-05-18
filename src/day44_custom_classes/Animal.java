package day44_custom_classes;

public class Animal {
    String animalType;
    String breed = "Dog Breed - ";

    public void eat(String food){
        System.out.println(animalType + " eats bones, meatballs, and " + food + ".");
    }
    public void speak(){
        System.out.println(animalType + " only speaks in low growls and shrill barks.");
    }

public static void main (String[] arg){
        Animal animal1 = new Animal();
        System.out.print(animal1.breed);
        animal1.animalType = "Husky";
        animal1.eat("kibbles");
        animal1.speak();
        System.out.println();

        Animal animal2 = new Animal();
        System.out.print(animal2.breed);
        animal2.animalType = "White Sausage Dog";
        animal2.eat("grass");
        animal2.speak();
        System.out.println();

        Animal animal3 = new Animal();
        System.out.print(animal3.breed);
        animal3.animalType = "Corgo Bean Butt";
        animal3.eat("pancakes");
        animal3.speak();

}


}

