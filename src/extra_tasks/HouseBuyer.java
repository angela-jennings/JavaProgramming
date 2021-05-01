package extra_tasks;
import java.util.Scanner;

public class HouseBuyer {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String neighborhoodName = "Hills";
    int averageHousePrice = 0;
    double schoolRating = 0.0;
    boolean gatedCommunity = true;
    boolean allowsPets = true;

    switch(neighborhoodName){
        case "Hills":
            averageHousePrice = 89_000;
            schoolRating = 4.0;
            gatedCommunity = !gatedCommunity;
            allowsPets = allowsPets;
            break;
        case "Oaks":
            averageHousePrice = 75_000;
            schoolRating = 3.5;
            gatedCommunity = !gatedCommunity;
            allowsPets = allowsPets;
            break;
        case "Highland":
            averageHousePrice = 150_000;
            schoolRating = 4.5;
            gatedCommunity = gatedCommunity;
            allowsPets = !allowsPets;
            break;
        case "Canyon":
            averageHousePrice = 201_000;
            schoolRating = 4.8;
            gatedCommunity = gatedCommunity;
            allowsPets = allowsPets;
            break;
    }

        System.out.println("Selected neighborhood = " + neighborhoodName + "\nAverage School Rating = " + schoolRating + "\nIs this a gated community? " + gatedCommunity + "\nDoes this neighborhood allow pets? " + allowsPets);




    }
}


/*[House Buyer ] - Look at CappuccinoBuyer from class for an idea

        You are buying a new house and need to collect information about the houses in a specific area. You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5), if it is a gated community or not, allow pets or not.

        Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

        Data based on neighborhood name:

        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes

        */
