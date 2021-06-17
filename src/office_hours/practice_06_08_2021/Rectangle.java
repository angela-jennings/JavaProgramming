package office_hours.practice_06_08_2021;

public class Rectangle extends Shape {
    double length;
    double width;

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (length * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
