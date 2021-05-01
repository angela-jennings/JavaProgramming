package replit_tasks;

public class DiagonalArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9},
        };

        int result = 0;
        int leftToRight = (matrix[0][0]+ matrix[1][1]+matrix[2][2]);
        System.out.println("leftToRight = " + leftToRight);
        int rightToLeft = (matrix[0][2] + matrix[1][1]+ matrix[2][0]);
        System.out.println("rightToLeft = " + rightToLeft);
        result = (leftToRight-rightToLeft);


        System.out.println(Math.abs(result));
    }
}
