package extra_tasks;

public class SportsFee {
    public static void main(String[] args) {
        String sport = "soccer";

        int entranceFee = (sport.equals("soccer")) ? 100 : 50;
        System.out.println("entranceFee = " + entranceFee);


    }
}
/* [Sport] **Ternary**

Given a sport you play at the community center you will have to pay some enterance fee.

    Soccer or Tennis fee is: 100
    Otherwise fee is: 50
*/