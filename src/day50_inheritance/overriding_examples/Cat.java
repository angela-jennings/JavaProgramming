package day50_inheritance.overriding_examples;

import day50_inheritance.overriding_examples.Animal;

public class Cat extends Animal {

    @Override
    public void speak(){
        System.out.println(animalName + " is meowing");
    }
    public void jump(){
        System.out.println(animalName + " is jumping");
    }
}
