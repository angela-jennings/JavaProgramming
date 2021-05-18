package day43_list_custom_methods;

public class Person {

    //firstName, age
    //data - variables - called FIELD
    String firstName;
    int age;
    char gender;
    //behaviour
    public void speak() {
        if(firstName.startsWith("A")){
            System.out.println(" is speaking");
        }else{
            System.out.println(" is not speaking");
        }

    }
}
class People {
    public static void main(String[] args) {
        //created object of Person class - Instantiated - call person like you would call String to declare
         Person person1 = new Person();
         person1.firstName = "Angela";
         person1.age = 30;
         person1.gender = 'F';

        System.out.print(person1.firstName);
        person1.speak();
        System.out.println(person1.age);
        System.out.println(person1.gender);

         Person person2 = new Person();
         person2.firstName = "Koga";
         person2.age = 10;
         person2.gender = 'F';

        System.out.print(person2.firstName);
        person2.speak();
        System.out.println(person2.age);
        System.out.println(person2.gender);

         Person person3 = new Person();
         person3.firstName = "Athena";
         person3.age = 11;
         person3.gender = 'F';
        System.out.print(person3.firstName);
        person3.speak();
        System.out.println(person3.age);
        System.out.println(person3.gender);


        System.out.println(person1.firstName.equals(person2.firstName)); //false

    }
}
