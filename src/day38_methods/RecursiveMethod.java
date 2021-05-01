package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
//        int num = 1;
//        System.out.println(num + " ");
//        num++;
//        main(null); //calling class back but need a static variable. this method doesnt work

        printNums(1);
        System.out.println();
        printNums(10);
        System.out.println();
        printNums(50);
    }
public static void printNums(int num){
    System.out.print(num + ", ");
    num++;
    if(num>= 0 && num<=100){
        printNums(num); //recursive method using if condition. this method takes up a lot of space. each number has its own container for space. calling back the same class causes it to loop


    }

}
}
