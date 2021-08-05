package day62_collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //this is polymorphism!!!!!
        Collection<String> schools = new ArrayList<>();
        /**
         * List is the parent to ArrayList. Collection is the parent of List. Iterable is parent of Collection
         */

        cities.add("Stevens Point");
        cities.add("Loveland");
        cities.add("Milwaukee");
        cities.add("Madison");
        cities.add("Fort Collins");
        cities.add("Austin");

        System.out.println(cities);
        System.out.println(cities.get(1));
        System.out.println("Cities count = " + cities.size());



    }
}
