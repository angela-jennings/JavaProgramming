package replit_tasks;
import java.util.*;
public class SplitArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here

        String[] newPerson = info.split(",");
        Arrays.toString(newPerson);
        System.out.println("person name: " + newPerson[0]);
        System.out.println("last name: " + newPerson[1]);
        System.out.println("age: " + newPerson[2]);




    }

}
