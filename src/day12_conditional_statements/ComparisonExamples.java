package day12_conditional_statements;

import javax.lang.model.SourceVersion;

public class ComparisonExamples {
    public static void main(String[] args) {
        /*int currentSpeed = 45;
        int speedLimit = 55;
        //System.out.println(currentSpeed > speedLimit);
        boolean isSpeeding = currentSpeed < speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("current speed: " + currentSpeed);
        System.out.println("Speed Limit: " + speedLimit);

        currentSpeed = currentSpeed + 20;
        System.out.println("current speed: " + currentSpeed);
        System.out.println("speed limit " + speedLimit);
        System.out.println(isSpeeding); */

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can i afford? - " + (accountBalance >= itemPrice)); //true - account balance is greater than or equal to item price

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);

        accountBalance -= itemPrice;
        System.out.println(accountBalance);

        boolean isBroke = accountBalance <= 0;
        System.out.println("am i broke = " + isBroke);
    }
}
