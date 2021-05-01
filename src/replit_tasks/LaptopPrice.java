package replit_tasks;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double basePrice = 0;
        System.out.println("Select screen size: ");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            basePrice += 200;
        } else if (screenSize == 15.0) {
            basePrice += 300;
        } else if (screenSize == 17.3) {
            basePrice += 400;
        }
        System.out.println("Select CPU type: ");
        String cpu = scan.next();
        if (cpu.equals("i3")) {
            basePrice += 150;
        } else if (cpu.equals("i5")) {
            basePrice += 250;
        } else if (cpu.equals("i7")) {
            basePrice += 350;
        }

        System.out.println("Select RAM size: ");
        int ram = scan.nextInt();
        basePrice += (ram / 4) * 50;

        System.out.println("Select storage type: ");
        String storage = scan.next();

        System.out.println("Enter storage size:");
        int storageSize = scan.nextInt();
        if (storage.equals("SSD")) {
            basePrice += ((storageSize / 500) * 100);
        } else if (storage.equals("HDD")) {
            basePrice += ((storageSize / 500) * 50);
        }

        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();
        if (screenResolution.equals("FULLHD")) {
            basePrice += 100;
        } else if (screenResolution.equals("4K")) {
            basePrice += 200;
        }

        System.out.println("Laptop price is: $" + basePrice);


    }
}


