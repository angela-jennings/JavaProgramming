package extra_tasks;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type whichever number relates to your favorite season");
        System.out.println("1 - Spring\n2 - Summer\n3 - Fall\n4 - Winter");
        int season = scan.nextInt();

        if (season == 1){
            System.out.println("Spring has 14 hours of day and 10 hours of night");
        }
        if (season == 2){
            System.out.println("Summer has 16 hours of day and 8 hours of night");
        }
        if (season == 3){
            System.out.println("Fall has 14 hours of day and 10 hours of night");
        }
        if (season == 4){
            System.out.println("Winter has 12 hours of day and 12 hours of night");
        }
    }
}
