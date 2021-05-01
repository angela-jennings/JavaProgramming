package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
checkEligible(795);
checkEligible(600);
checkEligible(701);
        System.out.println(getCreditScore()); //returns the whole number that was declared in the method
        System.out.println("Credit Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " + score);
    }
    public static void checkEligible(int creditScore){
        if(creditScore>= 700){
            System.out.println("You're eligible for a loan");
        }else{
            System.out.println("You are not eligible for a loan");
        }
    }

public static int getCreditScore(){
        return 800;
}
}
