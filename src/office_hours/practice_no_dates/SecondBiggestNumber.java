package office_hours.practice_no_dates;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};
//        Arrays.sort(nums);
//        System.out.println(nums[nums.length-1]);
//        System.out.println(nums[nums.length-2]);
        //this way works only if the largest number doesnt repeat. this way is "cheap way" because it doesnt show that you can use logic to find a solution to a problem. this would not be the best way to answer the question in an interview because again, it doesnt show that you can use logic to solve the problem


        int maxNum = nums[0];
        int secondMax = nums[0];

        for(int each : nums){
            if(each > maxNum){
                secondMax = maxNum;
                maxNum = each;
            }
            if(each > secondMax && each < maxNum){
                secondMax = each;
            }

        }
        System.out.println("Largest number = " + maxNum);
        System.out.println("Second largest number = " + secondMax);

    }
}
