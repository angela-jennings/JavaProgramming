package office_hours.Practice_06_14_2021;

public class Candy {
    private String brand;
    private int quantity;
    private boolean hasPeanuts;
    private static int totalNumOfCandy; //lets us know how many total candy objects were made, static means it belongs to the class, not the object

    public Candy(String brand, int quantity, boolean hasPeanuts) {
        this.brand = brand; //"this" is the reference to the instance variable
        setQuantity(quantity);
        this.hasPeanuts = hasPeanuts;
        totalNumOfCandy++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0){
            this.quantity = quantity;
        }

    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public static int getTotalNumOfCandy() {
        return totalNumOfCandy;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
