package replit_tasks;

public class PrintUniqueNumbersVoidMethod {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        int isUnique;
        boolean unique;
        for(int i = 0; i < nums.length; i++){
            isUnique = nums[i];
            unique = true;
            for(int j = 0; j < nums.length; j++){
                if(isUnique == nums[j] && i != j){
                    unique = false;
                    break;
                }
            }
       if(unique == true){
           System.out.println(isUnique);
       }

        }
    }
}


