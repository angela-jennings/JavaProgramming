package day63_collections;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list --> ArrayList

        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2); //highlighted in gray because its a duplicate

        System.out.println(set);

        Set<String> dogs = new HashSet<>();
        dogs.add("Koga");
        dogs.add("Athena");
        dogs.add("Sinclair");
        dogs.add("Sadie");
        dogs.add("Hubby");
        dogs.add("Athena"); //this one is a repeat and is highlighted

        System.out.println("dogs = " + dogs);

        //can covert Set to List by passing name of set
        List<String> newDogs = new ArrayList<>(dogs);
        System.out.println(newDogs);
        System.out.println(newDogs.get(1));
        newDogs.add("Bamboo");
        //bamboo added at end because for array list, String objects are always added at the end

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("123");
        linkedHashSet.add("123");
        linkedHashSet.add("Hello");
        linkedHashSet.add("Hello");
        linkedHashSet.add("4987");
        linkedHashSet.add("world");
        linkedHashSet.add("candy bars");
        linkedHashSet.add("Mashed potatoes");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("123");
        treeSet.add("123");
        treeSet.add("hello");
        treeSet.add("hello");
        treeSet.add("4987");
        treeSet.add("world");
        treeSet.add("candy bars");
        treeSet.add("mashed potatoes");

        System.out.println("treeSet = " + treeSet);
        System.out.println(treeSet.size());
        ((TreeSet)treeSet).first(); //tree set has methods that arent in set. used for searching
    }
}
