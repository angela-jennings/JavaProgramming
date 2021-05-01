package extra_tasks;
public class Author {
    public static void main(String[] args) {

        String bookGenre = "Fantasy";
        int averagePageLength = 0;
        long averageProfit = 0L;
        int averageNumberOfSequels = 0;
        int averageNumberOfCountriesPublished = 0;

        switch(bookGenre) {
            case "Fantasy":
                averagePageLength = 500;
                averageProfit = 1_000_000;
                averageNumberOfSequels = 5;
                averageNumberOfCountriesPublished = 50;
                break;

            case "Detective":
                averagePageLength = 350;
                averageProfit = 700_000;
                averageNumberOfSequels = 3;
                averageNumberOfCountriesPublished = 45;
                break;

            case "Science Fiction":
                averagePageLength = 720;
                averageProfit = 900_500;
                averageNumberOfSequels = 4;
                averageNumberOfCountriesPublished = 30;
                break;

            case "Short Story":
                averagePageLength = 150;
                averageProfit = 300_000;
                averageNumberOfSequels = 1;
                averageNumberOfCountriesPublished = 40;
                break;
        }

            System.out.println("Book genre = " + bookGenre + "\nThat genre has an average page length of " + averagePageLength + "\nThat genre has an average profit of " + averageProfit + "\nThat genre has an average of " + averageNumberOfSequels + " sequels\nThat genre is published in " + averageNumberOfCountriesPublished + " countries on average" );






    }
}
/*[Author] - Look at CappuccinoBuyer from class for an idea

        You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing. Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in.

        Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

        Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
        */