package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(1,2,4,5,6);
        addNumbers(5,15,14,1,53,453);


    }
    public static void addNumbers (int ... nums){ //this is treated as an array
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        System.out.print("sum = " + sum + " ");
        System.out.println();


    }
}
