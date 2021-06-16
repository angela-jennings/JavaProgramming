package day49_static;

public class BankAccount {
    static double balance = 500.0;
    String user;

public void spend (double amount) {
    System.out.println(user + " is spending $" + amount);
    balance -= amount;
    }
    public void showBalance(){
    if(balance>=0){
        System.out.println("Current balance is: $" + balance);
    }else{
        System.out.println("Current balance is negative: $" + balance + "\nMore funds needed");
    }

    }
}

