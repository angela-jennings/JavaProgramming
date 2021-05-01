package extra_tasks;

public class ZooBrochure {
    public static void main(String[] args) {

        String zooName = "Aleister Crowley Menagerie of Oddities";
        short foundedDate = 1920;
        String openClose = "10:00AM to 10:00PM";
        boolean holiday = true;
        boolean aquarium = false;
        byte numCats = 11;
        byte numUngulates = 12;
        short numReptiles = 666;
        short numBirds = 420;
        byte numPrimates = 4;
        byte numEmployees = 6;
        double adultPrice = 66.66;
        double childPrice = 33.33;
        String parkRules = "To ensure the safety of animals please respect the following rules: " + "\n" +
                "\t*Do not tap on glass" + "\n" + "\tDo not feed animals" + "\n" + "\tNo Running" + "\n" +
                "\tDo not attempt to enter animal enclosures" + "\n" + "\tBe safe, have fun and enjoy the menagerie";

        System.out.println("\t\t**Welcome to the " + zooName + "**" + "\n\nThe menagerie was founded in " + foundedDate +
                ". " + "Menagerie hours are " + openClose + " every day of the week. \nIs the menagerie open on Holidays? " + holiday + " \nTicket Prices for adults are $" + adultPrice + ". \nTicket prices for children 13 years and younger are $" + childPrice + ". \nDoes the menagerie have an aquarium? " + aquarium + "\nHow many employees does the menagerie have? " + numEmployees + "\n\nHow many of each of the following animals does the menagerie have: \n\tBig Cats: " + numCats + "\n\tUngulates: " + numUngulates + "\n\tReptiles: " + numReptiles + "\n\tBirds: " + numBirds + "\n\tPrimates: " + numPrimates + "\n\n\t***Please observe the following rules for a safe visit***" + "\n\n\t" + parkRules);

    }
}