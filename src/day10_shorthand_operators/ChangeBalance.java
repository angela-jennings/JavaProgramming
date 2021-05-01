package day10_shorthand_operators;
//import java.util.Scanner;

public class ChangeBalance {
    public static void main(String[] args) {
     //Scanner scan = new Scanner(System.in);
     double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //double newBalance = balance - baklava;
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        //System.out.println("newBalance = " + newBalance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after baklava and kenafa = " + balance);

        //double secondKenafa = kenafa/2;
        kenafa = kenafa/2;
        balance = balance - kenafa;
        System.out.println("balance after baklava and both kenafa = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea*4;
        System.out.println("balance after 4 iced teas = " + balance);

        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;

        System.out.println("balance after returning baklava = " + balance);

    }
}

