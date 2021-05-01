package extra_tasks;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms");
        double mass = scan.nextDouble();
        System.out.println("Enter your height in meters");
        double heightMeters = scan.nextDouble();
        double bmiFormula = (mass / (heightMeters * heightMeters));

        if (bmiFormula < 18.5) {
            System.out.println(bmiFormula + " - underweight");
        } else if (bmiFormula > 18.5 && bmiFormula < 25) {
            System.out.println(bmiFormula + " - Normal weight");
        } else if (bmiFormula > 25 && bmiFormula < 30) {
            System.out.println(bmiFormula + " - Overweight");
        } else if (bmiFormula == 30 || bmiFormula > 30) {
            System.out.println(bmiFormula + " - Obese");
        }


    }
}

/*BMI: Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
        —> BMI Formula: BMI = mass / height^2
        —> Values:
        Less than 18.5 — Underweight
        From 18.5 to 25 — Normal weight
        From 25 to 30 — Overweight
        More than or equal to 30 — Obese*/