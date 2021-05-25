package day46_encapsulation;

public class BankUserInformation {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.AccountInformation(100, 123456789, "Angela Jennings", "savings");
        System.out.println(myAccount);
        System.out.println();
        CheckingAccount otherAccount = new CheckingAccount();
        otherAccount.AccountInformation(1000, 123789456, "Angela Jennings", "checking");
        System.out.println(otherAccount);

    }
}
