package day51_inheritance;

public class Employee {
    String jobTitle;

    public double calculateSalary(double hourlyRate){
        double yearlySalary = hourlyRate*40*52;
        return yearlySalary*1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
