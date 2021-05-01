package day22_string_manipulation;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;

        while(i<=5){
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <=3){
            System.out.println("apples -> " + apples++);
            apples++;
        }
        System.out.println("new apples = " + apples);


    }
}
