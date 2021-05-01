package extra_tasks;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and width");
        int length, width, perimeter, area;
        System.out.print("Length: ");
        length = scan.nextInt();
        System.out.print("Width: ");
        width = scan.nextInt();
        perimeter = 2*(length*width);
        System.out.println("Perimeter: " + perimeter);
        area = length*width;
        System.out.print("Area: " + area);

    }
}
