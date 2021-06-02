package day49_static;

public class MyBankAccount {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.user = "Angela";
        user1.showBalance();
        user1.spend(100.25);
        user1.showBalance();

        BankAccount user2 = new BankAccount();
        user2.user = "Matt";
        user2.spend(250.50);
        user2.showBalance();
        user2.spend(300);
        user2.showBalance();
    }


}
