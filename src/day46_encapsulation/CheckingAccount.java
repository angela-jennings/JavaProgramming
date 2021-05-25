package day46_encapsulation;

public class CheckingAccount {
    private int balance;
    private long accountNumber;
    private String accountHolder;
    private String accountType;

    public void AccountInformation(int setBalance, int setAccountNumber, String setAccountHolder, String setAccountType){
        balance = setBalance;
        accountNumber = setAccountNumber;
        accountHolder = setAccountHolder;
        accountType =setAccountType;
    }

    public int getBalance(){
        return balance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountType(){
        if(!accountType.equalsIgnoreCase("checking")){
           return "incorrect account type";
        }
        return accountType;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
