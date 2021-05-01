package replit_tasks;
import java.util.*;

public class TimeConversionMethod {
    public static void main(String[] args) {

        timeConversion("12:00:00PM");

    }

    public static void timeConversion(String s) {
        int hours1 = 0;
        int hours2 = 0;
        int min1 = 0;
        int min2 = 0;
        int seconds1 = 0;
        int seconds2 = 0;

    if (s.contains("12:00:00PM")) {
        System.out.println("12:00:00");
    }
        if (s.equals("12:00:00AM")) {
            System.out.println("00:00:00");
        }
        if (s.contains("PM") && !s.contains("12:00:00PM")) {
            hours1 = Integer.parseInt(s.substring(0, 2));
            min1 = Integer.parseInt(s.substring(3, 4));
            min2 = Integer.parseInt(s.substring(4, 5));
            seconds1 = Integer.parseInt(s.substring(6, 7));
            seconds2 = Integer.parseInt(s.substring(7, 8));

            hours1 += 12;
            System.out.println(hours1 + ":" + min1 + min2 + ":" + seconds1 + seconds2);

        } else if (s.contains("AM") && !s.contains("12:00:00AM")) {
            hours1 = Integer.parseInt(s.substring(0, 1));
            hours2 = Integer.parseInt(s.substring(1, 2));
            min1 = Integer.parseInt(s.substring(3, 4));
            min2 = Integer.parseInt(s.substring(4, 5));
            seconds1 = Integer.parseInt(s.substring(6, 7));
            seconds2 = Integer.parseInt(s.substring(7, 8));

            System.out.println(hours1 + "" + hours2 + ":" + min1 + min2 + ":" + seconds1 + seconds2);


        }
    }
}
