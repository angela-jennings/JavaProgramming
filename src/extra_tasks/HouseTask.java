package extra_tasks;

public class HouseTask {
    public static void main(String[] args){
        String houseType = "McMansion";
        byte numOfBeds = 8;
        byte numOfBaths = 9;
        byte numOfKitchens = 2;
        boolean yes = true;
        String saleType = "Sale or Lease";
        double price = 699000.99;
        String streetAddress = "1331 Cleveland Avenue";
        String cityAddress = "Loveland";
        String stateAddress = "Colorado";
        int zipAddress = 80537;
        char whiteStar = 9733;
        char blackStar = 9734;

        System.out.print(whiteStar + "" +whiteStar + "" + whiteStar);
        System.out.print("BEAUTIFUL LOVELAND HOME FOR SALE");
        System.out.println(whiteStar + "" + whiteStar + "" + whiteStar);
        System.out.println("\n" + "Type of House: "+houseType);
        System.out.println("Number of Bedrooms: " +numOfBeds);
        System.out.println("Number of Bathrooms: " +numOfBaths);
        System.out.println("Number of Kitchens: " + numOfKitchens);
        System.out.println("Is there an attic: " + yes);
        System.out.println("Is there a pool: " + yes);
        System.out.println("Is there a basement: " + yes);
        System.out.println("Is there a park nearby: " + yes);
        System.out.println(saleType + " SALE");
        System.out.println("Sale Price: $" + price);
        System.out.println("Home Location:" +'\n'+'\t' + streetAddress);
        System.out.println('\t' + cityAddress +", " + stateAddress +", " + zipAddress);
        System.out.print("Walkability: ");
        System.out.println(whiteStar + "" + whiteStar + "" + whiteStar + "" + whiteStar + "" + blackStar);
        System.out.print("Neighborhood School Rating: ");
        System.out.print(whiteStar + "" + whiteStar + "" + whiteStar + "" + whiteStar + "" + blackStar);



















    }
}
