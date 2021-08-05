package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<String> dogs = new ArrayList<>();
        dogs.add("Koga");
        dogs.add("Athena");
        dogs.add("Hubby");
        dogs.add("Sadie");
        dogs.add("Sinclair");
        System.out.println(dogs);

        Iterator<String> it = dogs.iterator();

        System.out.println(it.next());
        it.remove();
        System.out.println(dogs);

        Set<String> names = new HashSet<>();
        names.add("Angela");
        names.add("Matt");
        names.add("Koga");
        names.add("Athena");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
           String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length()<5) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
