package day15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;

        System.out.println(apples > 3 || oranges > 4); //both conditions are true

        if(apples >3 || oranges >4){
            System.out.println("No need to buy anymore fruit");
        }else {
            System.out.println("we need to buy more fruit!");
        }

        System.out.println(apples >2 || oranges >10); //apples are true, oranges are false. overall = true

        if(apples >2 || oranges > 10){
            System.out.println("we are good with fruit"); //running if block that is true because one condition is true
        } else {
            System.out.println("GO BUY MORE FRUIT");
        }

        System.out.println(apples == 0 || oranges == 0); //false because both conditions are false



    }
}
