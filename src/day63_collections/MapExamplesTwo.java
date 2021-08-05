package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamplesTwo {
    public static void main(String[] args) {
        //id, Person object
        Map<Integer, Person> map = new HashMap<>();

        map.put(1234, new Person("Angela", 31));
        map.put(7894, new Person("Koga", 10));
        map.put(6549, new Person("Athena", 11));

    }
}
