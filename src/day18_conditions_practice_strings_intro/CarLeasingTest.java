package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make1 = "Mercedes";
        String model1 = "A";
        int leasePrice = 0;

        if (make1.equals("Mercedes")) {
            if (model1.equals("E")) {
                leasePrice = 500;
            } else if (model1.equals("A")) {
                leasePrice = 400;
                System.out.println("Make is " + make1 + " model is " + model1 + " for $" + leasePrice + " a month");
            }
            if (make1.equals("Audi")) {
                if (model1.equals("SQ5")) {
                    leasePrice = 500;
                } else if (model1.equals("SQ7")) {
                    leasePrice = 600;
                    System.out.println("Make is " + make1 + " model is " + model1 + " for $" + leasePrice + " a month");

                }
            }
        }
    }
}