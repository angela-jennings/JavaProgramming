package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
       int [] nums = {1,2,3,4,5,5};
        ArrayUtils.printArray(nums); //printing a variable that has been declared

        ArrayUtils.printArray(new int [] {2, 8, 89, 23, 535, 5543, 1}); //declaring variable in same line

        ArrayUtils.sum(new int[] {2,4,6,8,10}); //declaring array in same line
        ArrayUtils.sum(nums); //printing from an already declared array

        ArrayUtils.contains(new int[] {1,2,3,4,5,6,7,8,9}, 5);
        System.out.println(ArrayUtils.contains(nums, 8));
    }
}
