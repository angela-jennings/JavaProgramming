package day45_OOP;

public class Coffee {
    /**
     * can be 0-100 as a percentage
     */
    int amount;
    String type;

    public void refill(){
        amount = 100;
    }
    public void drink(int someAmount){
            amount = amount - someAmount;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public int getAmount(){
        return amount;
    }
    public void setType(String newType){
        type = newType;
    }
    public String getType(){
        return "type of coffee = " + type;
    }
}
