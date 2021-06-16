package office_hours.practice_05_12_2021;

public class BankAccount {
    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int pinCode){
        if(pin == pinCode){
            return balance;
        }
        return -1;
    }
}
