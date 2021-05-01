package extra_tasks;

public class SumEvenNumber {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <=100 ; i++ ){
            sum += i;
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("sum = " + sum);

    }

}
/*  Write a program that can calculate the sum of all the even numbers
between 1 ~ 100*/