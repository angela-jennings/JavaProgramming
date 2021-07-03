package day57_abstraction_polymorphism.shapes;

public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.print(" \u25D0" + " \u25D1 ");
    }
}
