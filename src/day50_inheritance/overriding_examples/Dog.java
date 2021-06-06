package day50_inheritance.overriding_examples;

import day50_inheritance.overriding_examples.Animal;

public class Dog extends Animal {

    @Override
    public void speak(){
        System.out.println(animalName + " is barking");
        //method was overridden from parent class
    }
    public void run(){
        System.out.println(animalName + " is running");
    }
}
