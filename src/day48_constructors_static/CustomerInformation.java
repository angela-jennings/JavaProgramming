package day48_constructors_static;

public class CustomerInformation {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Angela Jennings");
        customer1.setId(123456);
        System.out.println(customer1 + "\n");  //calling first customer method using no args constructor, then setting information, then printing out information

        Customer customer2 = new Customer("Koga", 123456);
        System.out.println(customer2 + "\n");

        Customer customer3 = new Customer("Athena", 123456);
        System.out.println(customer3 + "\n");

        Customer customer4 = new Customer();
        customer4.setName("Matt Oldenburg");
        customer4.setId(123456);
        System.out.println(customer4);
    }
}
