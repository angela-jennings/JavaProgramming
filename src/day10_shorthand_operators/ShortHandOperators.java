package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
       System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
       cars -=6;
        System.out.println("cars in parking lot = " + cars);
        cars -=1;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        cars = cars + electricCars;
        System.out.println("cars in parking lot = " + cars);
        cars += electricCars;

        String word = "Java";
        System.out.println("word = " + word);

        word = word + " programming";
        System.out.println("word = " + word);

        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += ", but selenium is more fun";
        System.out.println("word = " + word);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 74;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        parkingFee /=2;
        System.out.println ("Early bird parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);

        int count = 5;
        System.out.println("count = " + count);
        count ++;
        System.out.println("count = " + count);
        count --; count --; count --;
        System.out.println("count = " + count);
        
    }
}
