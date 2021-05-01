package extra_tasks;
import java.util.Scanner;

public class EligibleForLoan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yearly salary");
        int salary = scan.nextInt();
        System.out.println("Enter credit score");
        int creditScore = scan.nextInt();

        String eligibleForLoan = (salary>= 60000 && creditScore >=650) ? "Loan Approved" : "Loan Denied";
        System.out.println("eligibleForLoan = " + eligibleForLoan);
    }
}
/* Ternary
=======================================================

[Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"*/