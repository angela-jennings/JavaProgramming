package office_hours.practice_06_08_2021;

public class Circle extends Shape {
    double radius;
    double diameter = radius * 2;

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
        //called circumference but using perimeter since this is just a review of inheritance
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", circumference=" + perimeter +
                '}';
    }
}
