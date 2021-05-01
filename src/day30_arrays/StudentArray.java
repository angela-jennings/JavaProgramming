package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "19295";
        student1[1] = "Angela";
        student1[2] = "Jennings";
        student1[3] = "B22";
        student1[4] = "715-570-1509";   //this is the long way to write out each index

        String[] student2 = {"19296", "Aaron", "Jennings", "B0", "715-423-4763"}; //this is the short way

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);
        System.out.println("student data length = " + student1.length); // gives length of 5 because length starts at 1
        System.out.println();
        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 first name = " + student2[1]);
        System.out.println("student2 last name = " + student2[2]);
        System.out.println("student2 batch number = " + student2[3]);
        System.out.println("student2 phone number = " + student2[4]);
        System.out.println();

        if(student1.length == 5){
            System.out.println("student1 data array has correct length");
        }else{
            System.out.println("data length not long enough");
        }
        System.out.println();

        if(student1.length == student2.length){
            System.out.println("both data arrays have correct length");
        }else{
            System.out.println("1 or more data array is incorrect");
        }
        System.out.println();
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        System.out.println(student2[1].toUpperCase() + " " + student2[2].toUpperCase());

        String mobileNumber = student1[4]; //storing number into a string







    }
}
