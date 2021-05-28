package day47_constructors;

public class MyAddress {
    public static void main(String[] args) {
        Address myAddress = new Address("1331 Cleveland Avenue","Loveland", "Colorado", "80537");

        System.out.println(myAddress.toString());
        System.out.println(myAddress.getCountry());
        myAddress.setStreet("1234 Java Street");
        System.out.println("address after change - " + myAddress.toString());

        Address address2 = new Address("1234 Hello World Lane", "Java City", "Colorado", "12345");
        System.out.println(address2.toString());
        System.out.println(address2.getCountry());



    }
}
