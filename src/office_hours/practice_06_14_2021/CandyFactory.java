package office_hours.practice_06_14_2021;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy = new Candy("Snickers", 1, true);
        System.out.println(candy);

        Take5 barOne = new Take5(2, false);
        System.out.println(Candy.getTotalNumOfCandy());

    }
}
