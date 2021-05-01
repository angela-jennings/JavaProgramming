package extra_tasks;
import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the duration of the movie in hours and minutes to determine price");
        System.out.println("For example: 1 hour and 30 minutes = 1.5");
        double duration = scan.nextDouble();

        if (duration == 1.0) {
            System.out.println("movie price is $8.99");
        }
        if (duration == 1.5) {
            System.out.println("movie price is $10.50");
        }
        if (duration == 2.0){
            System.out.println("movie price is $12.99");
        }
        if (duration == 2.5){
            System.out.println("movie price is $14.50");
        }
        if (duration == 3.0){
            System.out.println("movie price is $15.99");
        }
    }
}