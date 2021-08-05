package day63_collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("two");
        queue.add("three");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.offer("five"));
        System.out.println(queue);
    }
}
