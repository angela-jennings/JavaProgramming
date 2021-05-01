package extra_tasks;

public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;

        if(numberOfAttempts==1){
            retakePenalty =(int)(baseGrade * .1);
        }
        if(numberOfAttempts==2){
            retakePenalty = (int) (baseGrade * .2);
        }
        if(numberOfAttempts==3) {
            retakePenalty = (int) (baseGrade * .3);
        }

        System.out.println("Grade after retake attempt number: " + numberOfAttempts + " is: " + (baseGrade - retakePenalty) + "%");
    }
}
