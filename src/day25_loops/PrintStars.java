package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int i = 1; i<=15; i++){
            System.out.print("*");
        }
        System.out.println();
    String myStars = "";
        for(int stars = 1; stars <=5; stars++ ){
            myStars += "* ";
        }
        System.out.print(myStars);

    }
}
