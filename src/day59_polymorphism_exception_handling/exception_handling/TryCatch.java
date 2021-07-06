package day59_polymorphism_exception_handling.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
            System.out.println(10/0);
            System.out.println(10/3);
        } catch(Exception e) {
            System.out.println("Runtime Exception happened and was handled");
        }
        System.out.println("After first try/catch");

        try {
            int[] nums = {11, 33, 144};
            System.out.println(nums[0]);
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error in code - catch happened");
        }
        System.out.println("End of try - catch");
    }
}
