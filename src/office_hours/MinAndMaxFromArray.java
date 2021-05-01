package office_hours;

public class MinAndMaxFromArray {
    public static void main(String[] args) {

        int[] arr = {3, 1, 5, -3, 10, 4, 3};
        int min = arr[0]; //assign the min as the first number in array so you have a reference point
        int max = arr[0]; //assign the max as the first number so there is a reference point

        for(int each : arr){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }
        System.out.println("max num = " + max);
        System.out.println("min num = " + min);
    }
}
