package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <String> books = new Stack<>();
        books.add("book1");
        books.add("book2");
        books.push("book5"); //works same way as add
        books.add("book3");
        books.add("book4");

        System.out.println(books.pop()); //removes (and returns) the last item added - element that is at the "top"
        System.out.println(books);
        System.out.println(books.peek()); //shows the last element in the stack and returns if printed - does not remove like pop method

        System.out.println(books);
    }
}
