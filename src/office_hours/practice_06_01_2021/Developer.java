package office_hours.practice_06_01_2021;

public class Developer {
/*
- create a class called Developer
     Attributes:
          name, employeeID, JobTitle, Salary
          hasCodingSkills

     Constructor:
          accepts and sets all instance variables

     Actions:
           getter/setters, coding(),  fixingBug(), toString()
 */

private String name;
private int employeeID;
private String jobTitle;
private double salary;
private static boolean hasCodingSkills = true;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(this.name + " is coding");
    }

    public void fixingBug(){
        System.out.println(this.name + " is fixing a bug");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean isHasCodingSkills() {
        return hasCodingSkills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
