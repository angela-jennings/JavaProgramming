package extra_tasks;
import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hour in 24 hour format");
        int hour = scan.nextInt();

        if(hour>8 && hour<23){
            System.out.println("Campus Open");
        }else if(hour == 0 || hour == 1 || hour == 2 || hour == 3 || hour == 4 || hour == 5 || hour == 6 || hour == 7 || hour == 24 ){
            System.out.println("Campus closed");
        }else{
            System.out.println("Invalid Time");
        }
    }
}

    /*Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
        > Campus is open from 8 am(8) to 11 pm (23)
        > If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
        > If the user enters an invalid ur (negative number or more than 24 hours) they should see an error message: “invalid time”*/