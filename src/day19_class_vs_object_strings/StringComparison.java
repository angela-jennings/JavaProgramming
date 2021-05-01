package day19_class_vs_object_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Loveland";
        //equals() method = case sensitive
        System.out.println(city.equals("Loveland")); // returns true
        System.out.println(city.equals("loveland")); // returns false because case sensitive
        System.out.println(city.equals("Loveland ")); // also false because of space at end
        //equalsIgnoreCase = not case sensitive
        System.out.println(city.equalsIgnoreCase("loveland")); // returns true
        System.out.println(city.equalsIgnoreCase("LOVELAND")); // returns true
        System.out.println(city.equalsIgnoreCase("LoVeLaNd")); // returns true
        System.out.println(city.equalsIgnoreCase("Love land")); // returns false - space is a character

        if(city.equals("LOVELAND")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("LOVELAND")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

    }
}
