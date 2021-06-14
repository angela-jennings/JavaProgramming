package day53_inheritance.tesla;

public class ElectricCars {
    private String model;
    private String make;
    private double price;
    private int year;
    private int range;
    private static int count; //all objects will share this variable
    public static final int MAX_RANGE = 400;

    public ElectricCars(String make, String model, double price, int year, int range){
        setMake(make);
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }
    public final void charge(){
        System.out.println("Charging the Electric Car using plug-in");
        this.range = MAX_RANGE;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "ElectricCars{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    protected void drive(int miles){
        if(range == 0 || range - miles < 0){
            System.out.println("ERROR: NEED TO CHARGE VEHICLE");
        } else {
            System.out.println("Driving " + miles + " miles. Remaining miles = " + (range - miles));
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
