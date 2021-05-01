package replit_tasks;
import java.util.Scanner;

public class BlackjackHands {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter card total first for house, then for player");
        int house = s.nextInt();
        int player = s.nextInt();

        //Write your code here:
        if(house<21 && house>player){
            System.out.println("player loss");
        }else if(player>house && player <=21){
            System.out.println("player win");
        }else if(player == house){
            System.out.println("its a tie");
        }else if(player>21){
            System.out.println("player bust");
        }


    }
}
