package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        square.draw();
        circle.draw();
        triangle.draw();

        List<Shape> allShapes = new ArrayList<>();
        allShapes.add(new Square());
        allShapes.add(new Square());
        allShapes.add(new Square());
        allShapes.add(new Square());
        allShapes.add(new Square());
        allShapes.add(new Circle());
        allShapes.add(new Circle());
        allShapes.add(new Circle());
        allShapes.add(new Triangle());
        allShapes.add(new Triangle());
        allShapes.add(new Triangle());
        allShapes.add(new Triangle());
        allShapes.add(new Triangle());

        for(Shape each : allShapes){
            each.draw();
        }
        System.out.println();
        drawShape(new Triangle());
        drawShape(new Square());
        drawShape(new Circle());
    }

    public static void drawShape(Shape shape){
        System.out.println("-----Drawing Shape-----");
        for(int i = 0; i <10; i++){
            shape.draw();
        }
        System.out.println();
    }
}
