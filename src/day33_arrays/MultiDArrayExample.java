package day33_arrays;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Angela Jennings"; //name and password - this is the long way
        users[0][1] = "koga123";
        users[1][0] = "Koga Jennings";
        users[1][1] = "123koga";
        users[2][0] = "Athena Jennings";
        users[2][1] = "ilovefood";

        String[][] userData = { {"Angela Jennings", "koga123"},
                                {"Koga Jennings", "123koga"},
                                {"Athena Jennings", "ilovefood"},
        };

        System.out.println("" + userData[0][0] + " " + userData[1][0] + " " + userData[2][0]); //prints all usernames
        System.out.println(userData[0][1] + " " + userData[1][1] + " " + userData[2][1]); //prints all passwords
        //row always first, then column

        System.out.println(Arrays.deepToString(userData));
    }
}
