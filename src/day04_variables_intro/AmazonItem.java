package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String productDescription = "HIC Wooden Spoon";;
        int ratingsCount = 181;
        double price = 5.99;
        String seller = "amazon.com";
        boolean prime = true;

        System.out.println ("****PRODUCT INFORMATION****");
        System.out.println(productDescription);
        System.out.print("Number of Ratings:\t");
        System.out.println(ratingsCount);
        System.out.print("Price: $");
        System.out.println(price);
        System.out.print("Shipped From: ");
        System.out.println(seller);
        System.out.print("Included in Prime? ");
        System.out.println(prime);




    }
}
