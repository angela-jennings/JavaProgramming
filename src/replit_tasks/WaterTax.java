package replit_tasks;
import java.util.*;
public class WaterTax {
    public static double waterTax(double units) {
        double bill = 0.0;

        if (units <= 50) {
            bill = units * .6;
        } else if (units > 50 && units<100) {
            bill = units * .9;
        } else if (units > 100 && units<150) {
            bill = (units * .9 + 50);
        } else if (units > 150) {
            bill = (units * .9 + 100);
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));

    }
}
