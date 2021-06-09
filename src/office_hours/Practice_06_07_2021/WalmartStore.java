package office_hours.Practice_06_07_2021;

import java.util.ArrayList;

public class WalmartStore {
    String location;
    double totalWorth;
    ArrayList<Item> inventory;
    static String companyName;

    static{
        companyName = "Walmart";
    }


    public WalmartStore(String location){
        this.location = location;
        this.inventory = new ArrayList<>();
    }
    public WalmartStore(String location, ArrayList<Item> allItems){
        this.location = location;
        this.inventory = allItems;
        calculateWorth();
    }

    public void calculateWorth(){
        for(Item eachItem : inventory){
            totalWorth += (eachItem.price * eachItem.quantity);
        }
    }

    @Override
    public String toString() {
        return "WalmartStore{" +
                "location='" + location + '\'' +
                ", totalWorth=" + totalWorth +
                ", inventory=" + inventory +
                '}';
    }
}
