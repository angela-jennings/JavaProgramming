package day43_list_custom_methods;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Angela Jennings";
        employee1.jobTitle = "SDET";
        employee1.company = "Company X";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Koga";
        employee2.jobTitle = "Fluff Monster";
        employee2.company = "Stinky Husky Farm Inc.";
        employee2.work();

        Employee employee3 = new Employee();
        employee3.name = "Athena";
        employee3.jobTitle = "Garbage Eater";
        employee3.company = "The Trash Heap";
        employee3.work();


    }
}
