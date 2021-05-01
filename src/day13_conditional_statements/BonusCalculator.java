package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 2000.55;

        if(salesAmount<=1000){
            System.out.println("good job, you qualified for a bonus!" + (bonus=50));
        }else{
            System.out.println("great job, you are qualified for a bonus!" + (bonus=100));

        }
    }
}
