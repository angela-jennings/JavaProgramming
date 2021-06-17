package office_hours.practice_no_dates;

import java.util.Arrays;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 12, 5};
        int evenCount = 0;
        int oddCount = 0;
        for(int each : arr){
            if(each%2 == 0){
              evenCount++;
            }
            if(each%2 != 0){
                oddCount++;
            }
        }
        System.out.println("even count = " + evenCount);
        System.out.println("odd count = " + oddCount);


        int[] evenNumber = new int [evenCount];
        int[] oddNumber = new int [oddCount];

        //i - keep track of the indexes in your array
         // e - keep track of indexes in evenNums array
        // o - keep track of indexes in oddNums array
        for(int i = 0, e = 0, o = 0; i <arr.length; i++){
            if(arr[i]%2==0){
                evenNumber[e] = arr[i];
                e++; //increase here so that the e value only increases after adding to evens array
                //alternatively you can do evenNumber[e++] since e is post incremented
            }else{
                oddNumber[o++] = arr[i]; //if arr = odd you just get 0 since it only stores that an additional number was added to array but no value
            }
        }

        System.out.println(Arrays.toString(evenNumber));
        System.out.println(Arrays.toString(oddNumber));
    }
}
