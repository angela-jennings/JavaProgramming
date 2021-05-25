package office_hours.Practice_05_17_2021;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        rectangle.setDimensions(5, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        System.out.println();

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getArea());
        rectangle1.setDimensions(5, 15);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1);


    }
}
