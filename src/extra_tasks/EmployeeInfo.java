package extra_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
    String firstName = "Angela";
    String lastName = "Jennings";
    String fullName = firstName + " " + lastName;
    String compName = "Pop Punk Pizza Party";
    int salary = 123000;
    byte startDay = 18;
    short startYear = 2021;
    byte startMonth = 5;
    String fullStartDate = ((startMonth)+"/"+(startDay)+"/"+(startYear));
    boolean fullTime = true;
    String jobTitle = "Emo Music DJ";
    String officeAddress = "123 Cleveland Avenue";

    System.out.println("\t\t***NEW EMPLOYEE INFORMATION***");
    System.out.println("\nCompany Name: " + compName + "\nAddress: " + officeAddress);
    System.out.println("\nEmployee Name: " + fullName);
    System.out.println("Employee Base Salary: $" + salary);
    System.out.println("Employee Salary after Three Years: $" + (salary)*(startMonth));
    System.out.println("Hire Date: " + fullStartDate);
    System.out.println("Employee Title: " + jobTitle);
    System.out.println("Is the employee full time: " + fullTime);

    }
}
