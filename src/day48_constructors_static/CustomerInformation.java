package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println(customer4 + "\n");

        //array of Customers
        Customer[] todaysCustomers = {customer1, customer2, customer3, customer4, new Customer("Person", 123456)};
        System.out.println(todaysCustomers[0]);
        System.out.println(Arrays.toString(todaysCustomers) + "\n");

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(new Customer("another person", 123456));
        //because of constructor, we can add new customers in the array list because of the parameters given in customer class constructor
        System.out.println(customerList.get(0));
        System.out.println(customerList + "\n");

        for (Customer customer : customerList) {
            System.out.println(customer);
        } //for each loop of array list "customerList"

        System.out.println();

        for(int i = 0; i<customerList.size(); i++){
            System.out.println(customerList.get(i));
        } //using for i loop to print array list "customerList" using .get(i)

        //print only the names of the customers
        System.out.println();
        for (Customer customer : customerList) {
            System.out.println(customer.getName());
        }

        System.out.println();

        //printing each name using lambda
        customerList.forEach(each -> System.out.println(each.getName()));




    }
}
