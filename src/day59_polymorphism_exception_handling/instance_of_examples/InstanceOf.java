package day59_polymorphism_exception_handling.instance_of_examples;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if(shape instanceof Circle) {
            System.out.println("It is a circle object");
        }else if (shape instanceof Square) {
            System.out.println("It is a square object");
        }

        //java reflection API example
        System.out.println(shape.getClass().getSimpleName()); //returns only class name of object
        System.out.println(shape.getClass().getName()); //returns whole package name

        if(shape.getClass().getSimpleName().equals("Circle")){
            System.out.println("It is a Circle object");
        }else if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a Square object");
        }else{
            System.out.println("It is neither shape");
        }

        System.out.println(shape.getClass().getDeclaredMethods().length); //prints how many methods are in shape class
    }
}
