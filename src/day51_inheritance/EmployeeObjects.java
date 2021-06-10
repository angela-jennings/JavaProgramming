package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.jobTitle = "SDET";
        System.out.println("Employee Salaray - $" + Math.round(emp1.calculateSalary(50.00)));
        System.out.println(emp1);

        Contractor cont1 = new Contractor();
        cont1.jobTitle = "SDET Contractor";
        System.out.println("Contractor Salary - $" + Math.round(cont1.calculateSalary(50)));
        System.out.println(cont1);

        Contractor cont2 = new Contractor();
        cont2.jobTitle = "Sdet Contractor";
        double cont2Salary = Math.round(cont2.calculateSalary(60));
        System.out.println("Contractor 2 Salary - $" + cont2Salary);
        System.out.println(cont2);

    }
}
