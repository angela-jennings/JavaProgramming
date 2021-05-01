package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        ArrayList<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mercedes");
        myCars.add("Nissan");
        myCars.add("Ford");
        myCars.add("Tesla");
        myCars.add("Kia");
        myCars.add("Subaru");
        myCars.add(0, "Geo");
        myCars.add(1, "BMW");

        System.out.println(myCars.toString()); //prints all cars
        String allCarsOneStr = myCars.toString();
        System.out.println("All cars in one string: " + allCarsOneStr);

        //change value 0 to a different car
        myCars.set(0, "Volkswagen");
        System.out.println(myCars);

        myCars.set(3, "Honda");
        System.out.println(myCars);

        //replace bmw with ford
        System.out.println(myCars.indexOf("BMW"));


        if(myCars.contains("Tesla")){
            System.out.println("list contains Tesla");
        }
        if(myCars.contains("Kia")){
            myCars.set(7, "Other car");
        }
        System.out.println(myCars);


        for(int i = 0; i<myCars.size(); i++){
            if(myCars.get(i).equals("BMW")){
                myCars.set(i, "Prius");
            }
            if(myCars.get(i).equals("Honda")){
                myCars.set(i, "Different Car");
            }
            if(myCars.get(i).equals("Subaru")){
                myCars.set(i, "A Different Subaru");
            }
        }
        System.out.println();
        System.out.println("----New Car List----");
        System.out.println(myCars);

    }
}
