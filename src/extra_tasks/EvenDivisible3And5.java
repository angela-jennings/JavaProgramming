package extra_tasks;

public class EvenDivisible3And5 {
    public static void main(String[] args) {
        for(int i = 0; i <=100; i+=2){
            if(i%2==0){
                if(i%3==0 && i%5==0){
                    System.out.println(" even numbers divisible by 3 and 5 = " + i);

                }
            }
        }
    }
}
/* • Write a program that can print all the EVEN numbers between 0 ~
100 that can be divisible by 3 & 5*/