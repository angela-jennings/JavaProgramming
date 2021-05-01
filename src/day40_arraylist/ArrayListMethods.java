package day40_arraylist;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("Is empty? " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty - keep coding java");
        }else{
            System.out.println("List is not empty - go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("shirt");
        shoppingList.add("pants");
        shoppingList.add("backpack");
        shoppingList.add("plants");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty - keep coding java");
        }else{
            System.out.println("List is not empty - go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("Is shoes in my list? " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("already bought shoes");
        }else{
            System.out.println("didnt buy shoes yet");
        }

        System.out.println("buying shoes... $80");
        shoppingList.remove("shoes");

        System.out.println(shoppingList);
        System.out.println("done shopping - get back to coding ");
        shoppingList.clear();
        System.out.println(shoppingList);

    }
}
