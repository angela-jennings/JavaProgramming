package day46_encapsulation;

public class Car {
    private String model;
    private int year;
    private int mileage;

    public void setModel(String carModel){
        model = carModel;
        if(model.length()<=1){
            System.out.println("Not a valid car");
        }
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year = year;
        //if you dont use this keyword, java doesnt know that you mean the instance variable and even if you set the year, it will point back to the instance variable which wasnt initialized
    }
    public int getYear(){
        return year;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public int getMileage(){
        return mileage;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
