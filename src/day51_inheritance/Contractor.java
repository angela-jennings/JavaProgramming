package day51_inheritance;

public class Contractor extends Employee{

    @Override  //looks better to include @Override, that way people reading your code know right away that it is an overridden method. ALSO - @Override will be red if the method is not actually overridden. Good to catch spelling errors or any difference in the method name
    public double calculateSalary(double hourlyRate) {
        double yearlySalary = hourlyRate * 40 * 52;
        return yearlySalary;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
