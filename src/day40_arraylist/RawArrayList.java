package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        /**
        array list is a class in java that is used to store multiple sets of data like array. however, array list is flexible while array is fixed
        1.) keeps index ordering
        2.) allows duplicated values
         * how to declare arraylist:
         * ArrayList list = new ArrayList();
         * -or- List list2 = new ArrayList(); <-- polymorphic way
         * ArrayList is located in java.util package and needs to be imported
         *
         */

        //declare raw arraylist
        ArrayList list1 = new ArrayList(); //default capacity in arraylist = 10 (10 null data)
        List list2 = new ArrayList();

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(66.6);
        list1.add(true);
        list1.add("wooden spoon");
        System.out.println(list1);
        System.out.println(list1.size());

        //raw arraylist is an arraylist that can store objects of any type - not recommended to use like this unless in certain cases (will learn later)
        //ArrayList list = new ArrayList();
        //list.add("hi");
        //list.add(15);
        //list.add(true);

        //instead need to use restricted type that only allows certain type of data
        //ArrayList <Integer> nums = new ArrayList<>();
        // arraylist internally uses arrays - arraylist based on array
        // -> wraps around normal array - uses dynamic array by copying values

    }
}
