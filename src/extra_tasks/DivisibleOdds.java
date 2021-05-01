package extra_tasks;

public class DivisibleOdds {
    public static void main(String[] args) {

        for(int i = 1; i <=100; i++){
            if(i%2 != 0){
                if(i%3==0 && i%5==0){
                    System.out.println(i + " is an odd number divisible by 3 and 5");
            }

            }
        }
    }
}
/*  Write a program that can print all the ODD numbers between 0 ~ 100
that can be divisible by 3 & 5*/