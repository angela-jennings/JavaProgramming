package day62_collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("Wisconsin");
        states.add("Colorado");

        System.out.println(states);
        //vector is synchronized
    }
}
