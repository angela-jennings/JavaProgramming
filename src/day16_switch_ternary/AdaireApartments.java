package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 4;
        int startingPrice = 0;

        System.out.println("****WELCOME TO ADAIRE APARTMENTS*****");
        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("We do not offer an apartment that size");
        }

        System.out.println("Apartment price = $" + startingPrice);
    }
}
