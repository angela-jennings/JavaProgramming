package office_hours.Practice_06_07_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class WalmartTest {
    public static void main(String[] args) {
        WalmartStore store1 = new WalmartStore("CO");
        System.out.println(store1);

        Item pen = new Item("pen", 1.4, 10);
        Item hat = new Item("hat", 3.5, 20);
        ArrayList<Item> allItems = new ArrayList<>();
        allItems.add(pen);
        allItems.add(hat);

        WalmartStore store2 = new WalmartStore("WI", allItems);
        System.out.println(store2);

    }
}
