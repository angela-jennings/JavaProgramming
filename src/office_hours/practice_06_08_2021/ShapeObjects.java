package office_hours.practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {
        Square sq1 = new Square();
        sq1.side = 5;
        sq1.calculateArea();
        sq1.calculatePerimeter();
        System.out.println("sq1.area = " + sq1.area);
        System.out.println("sq1.perimeter = " +sq1.perimeter);
        System.out.println("sq1 = " + sq1);

        Rectangle rec1 = new Rectangle();
        rec1.width = 5;
        rec1.length = 8;
        rec1.calculateArea();
        rec1.calculatePerimeter();
        System.out.println(rec1);

        Circle cir = new Circle();
        cir.radius = 2.75;
        cir.calculateArea();
        cir.calculatePerimeter();
        System.out.println("cir = " + cir);
    }
}
