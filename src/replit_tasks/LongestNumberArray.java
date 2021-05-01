package replit_tasks;

public class LongestNumberArray {
    public static void main(String[] args) {
        int[][] nums2D= {
                //0,  1,   2,  3   4
                {12,  55,  4},    //0
                {123, 555, 9},       //1
                {56,  87,  455},   //2
                {234, 12,  54},//3
        };
        int longest = nums2D[0][0];
        for(int a = 0; a < nums2D.length; a++){
            for(int b = 0; b < nums2D[a][0]; b++)
                if(nums2D[a][b] > longest){
                    longest = nums2D[a][b];
                    a=0;
                }
            System.out.println(longest);
        }
    }
}
