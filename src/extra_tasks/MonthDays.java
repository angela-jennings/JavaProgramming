package extra_tasks;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any month to find out how many days are in that month");
        String month = scan.next();
        int days = 0;

        if (month.equals("January") || month.equals("january")) {
            days = 31;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("February") || month.equals("february")) {
            days = 28;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("March") || month.equals("march")) {
            days = 31;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("April") || month.equals("april")) {
            days = 30;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("May") || month.equals("may")) {
            days = 31;
            System.out.println((month + " has " + days + " days"));
        } else if (month.equals("June") || month.equals("june")) {
            days = 30;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("July") || month.equals("july")) {
            days = 31;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("August") || month.equals("august")) {
            days = 31;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("September") || month.equals("september")) {
            days = 30;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("October") || month.equals("october")) {
            days = 31;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("November") || month.equals("november")) {
            days = 30;
            System.out.println(month + " has " + days + " days");
        } else if (month.equals("December") || month.equals("december")) {
            days = 31;
            System.out.println(month + " has " + days + " days");
        } else {
            System.out.println("Not a valid month");
        }

    }
}





    /*Write a program that will accept a number representing the month. Print out how many days are in that given month. Assume February (2) has 28 days
        Ex:
        Input: 1
        Output: 31 days

        Input: 2
        Output: 28 days*/