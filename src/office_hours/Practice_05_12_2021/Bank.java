package office_hours.Practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccountOne = new BankAccount();
        bankAccountOne.accountHolderName = "Koga Jennings";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 100.00;
        bankAccountOne.accountNumber = 123456789;

        System.out.println(bankAccountOne.pin);

        System.out.println(bankAccountOne.getBalance(1234));
        System.out.println();

        System.out.println(new BankAccount().accountHolderName);

        bankAccountOne = new BankAccount();
        System.out.println(bankAccountOne.accountHolderName);
        //value is null because a new account was made but no information was given to new object

    }
}
