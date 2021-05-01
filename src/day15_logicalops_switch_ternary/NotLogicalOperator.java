package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);

        int age = 2;
        if(!(age>7)){
            System.out.println("Child needs a car seat");
        }else{
            System.out.println("Child does not need a car seat");
        }

        boolean isSmokingAllowed = true;

        if(!isSmokingAllowed){
            System.out.println("Get your cancer sticks away from my children!");
        }else{
            System.out.println("Smoke away my friend");
        }

        boolean isAffordable = false;
        if(!isAffordable){
            System.out.println("Item is not affordable");
        }

        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if input password is not equals secret Password print "Incorrect password"

        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect Password");
        }

        if(!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect Password Again");
        }
    }
}
