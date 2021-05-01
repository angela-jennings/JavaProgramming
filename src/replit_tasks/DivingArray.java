package replit_tasks;
import java.util.*;
public class DivingArray {
    public static void main(String[] args) {
        /* In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive. The degree of difficulty ranges from 1.2 to 3.8 points.
The total is then multiplied by 0.6 to determine the divers score.
Flow:
Accept the 7 scores from the judges
Accept the difficulty number
Display the final score*/
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        int judgeNumber = 1;
        for(int i = 0; i<7; i++){
            System.out.println("Enter score for judge " + judgeNumber + ":");
            score[i] = input.nextFloat();
            judgeNumber++;
        }
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        Arrays.sort(score);
        float addedScore = score[1] + score[2] + score[3] + score[4] + score[5];
        double sum = (addedScore*difficulty);
        double totalScore = sum*.6;
        Formatter form = new Formatter();
        form.format("%.2f", totalScore);
        System.out.println("Total: " + form.toString());






    }
}
