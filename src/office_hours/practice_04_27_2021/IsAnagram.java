package office_hours.practice_04_27_2021;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("java", "cava"));
    }
    public static boolean isAnagram(String one, String two){
        one = one.toLowerCase();
        two = two.toLowerCase();

        if(one.length() != two.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i <one.length(); i++){
            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);
            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;
        }
        return Arrays.equals(count, new int[26]);
    }
}
