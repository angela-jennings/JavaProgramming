package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner wage = new Scanner(System.in);
        System.out.println("What is your hourly rate? ");
        int hourlyRate = wage.nextInt();
        int weeklyPay = hourlyRate*40;
        int monthlyPay = (52/12)*weeklyPay;
        int annualPay = monthlyPay*12;
        int monthlyExpenses = -2500*12;
        System.out.println("Weekly Rate = $ " + weeklyPay);
        System.out.println("Montly Rate = $ " + monthlyPay);
        System.out.println("Annual Rate = $ " + annualPay);
        System.out.println("Yearly Take Home After Taxes and Expenses = $ " + (annualPay*.70 + monthlyExpenses));

        //System.out.println("Hourly Rate = $" + hourlyRate + "\nWeekly Rate = $" + weeklyPay + "\nMonthly Pay: $" + monthlyPay + "\nAnnual Pay = $" + annualPay);

    }
}
