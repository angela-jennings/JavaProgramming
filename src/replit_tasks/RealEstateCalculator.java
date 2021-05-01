package replit_tasks;
import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType=scan.nextLine();
        if(houseType.equals("Condo")){
            propertyPrice += 50_000;
        }else if(houseType.equals("Townhouse")){
            propertyPrice += 75_000;
        }else if(houseType.equals("Single Family Home")){
            propertyPrice += 95_000;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += (numberOfBedrooms*30_000);

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if(houseType.equals("Condo") && backyard == true){
            System.out.println("Backyard is not available for condo!");
        }else if(backyard == true){
            propertyPrice += 5_000;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();

        if(garage == true){
            System.out.println("How many spots?");
        }
        garageSpots = scan.nextInt();
        if(garageSpots<=9){
            propertyPrice += garageSpots*20_000;
        }else if(garageSpots >= 10){
            System.out.println("Pardon, it's not a public parking!");
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if(metroAccessibility<=1.0){
            propertyPrice +=10_000;
        }if(metroAccessibility >=1.1 && metroAccessibility<=3.0){
            propertyPrice +=5_000;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if(highwayAccessibility <= 1.0){
            propertyPrice +=15_000;
        }else if(highwayAccessibility >=1.1 && highwayAccessibility <=5.0){
            propertyPrice +=8_000;
        }else if(highwayAccessibility >5.1 && highwayAccessibility <20.0){
            propertyPrice += 4_000;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if(schoolScore<=10 && schoolScore >=8){
            propertyPrice += 45_000;
        }else if(schoolScore <=7 && schoolScore >=4){
            propertyPrice += 20_000;
        }else if(schoolScore <=3 && schoolScore >=0){
            propertyPrice += 5_000;
        }

        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if(smoking == true){
            propertyPrice -= 5_000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + ("$"));











    }
}