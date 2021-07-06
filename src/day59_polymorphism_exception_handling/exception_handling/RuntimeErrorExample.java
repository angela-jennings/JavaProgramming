package day59_polymorphism_exception_handling.exception_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
       // System.out.println(10/0); //runtime exception. code compiles but while running it fails and throws arithmetic exception
        System.out.println(10/3);

        int[] nums = {4, 6, 10};
        System.out.println(nums[0]);
        System.out.println(nums[3]); //ArrayIndexOutOfBoundsException - code compiles fine, but there is nothing at index number 3. code won't be red and show and error, but will not run correctly
    }
}
