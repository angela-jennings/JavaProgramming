package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare new arraylist
        ArrayList <String> cities = new ArrayList <> ();
        //add cities to arraylist
        cities.add("Loveland"); //0
        cities.add("Fort Collins"); //1
        cities.add("Milwaukee"); //2
        cities.add("Madison"); //3
        cities.add("Wisconsin Rapids"); //4
        cities.add("Stevens Point"); //5
        cities.add("Austin"); //6
        //add new city to first index
        cities.add(0, "Nekoosa"); //now this is index 0 and everything has moved up

        System.out.println(cities); //can print array list by just calling name of array list - dont need String.ArrayList();

        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("Last city = " + cities.get(cities.size()-1));

        //print size of array
        System.out.println(cities.size());

        //print all values using for loop
        for(int i = 0; i<cities.size(); i++){  //print half by doing size()/2
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("----cities with for each loop----");
        for(String each: cities){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println();
        //remove from arraylist
        //1 - remove using index
        cities.remove(2);
        System.out.println(cities);
        //2 - remove using object (valueOf)
        cities.remove("Wisconsin Rapids");
        System.out.println(cities);

        //delete all values
        cities.clear();

        //verify it is clear
        System.out.println("cities = " + cities);

        //using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }



    }
}
