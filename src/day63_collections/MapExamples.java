package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        //id, names <-- key/value. id has to be unique, but names can be same
        Map <Integer, String> map = new HashMap<>();
        map.put(1234, "Angela");
        map.put(4567, "Koga");
        map.put(8910, "Athena");
        map.put(8120, "Sarah");
        map.put(5049, "Matt");

        System.out.println("map = " + map);
        System.out.println(map.get(1234)); //get works by taking key and returning matching value
        System.out.println(map.get(8910));
        map.remove(1234); //remove by key
        System.out.println(map);
        map.put(4589, "Angela");
        System.out.println(map + " " + map.size());

        System.out.println(map.containsKey(4589));
        System.out.println(map.containsValue("Koga")); //return boolean

        for(Integer key : map.keySet()){
            System.out.println(key + " - " + map.get(key));
        }
    }
}
