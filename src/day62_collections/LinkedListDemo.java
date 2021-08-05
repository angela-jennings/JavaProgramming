package day62_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        List<String> friends = new LinkedList<>();

        nums.add(5);
        nums.add(15);
        nums.add(25);
        nums.add(40);
        nums.add(5);
        System.out.println(nums);
        System.out.println("Index number 2 = " + nums.get(2));

        friends.add("Koga");
        friends.add("Athena");
        friends.add("Sarah");
        friends.add("Koga");
        System.out.println(friends);


    }
}
