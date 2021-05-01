package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 92;
        if(score >= 1 && score <= 40){
            System.out.println("Grade is a D");
        }else if(score >41 && score <= 60){
            System.out.println("Grade is a C");
        }else if(score>61 && score <= 90){
            System.out.println("Grade is B");
        }else if (score>91 && score <100){
            System.out.println("Grade is A");
        }else{
            System.out.println("Not a valid grade");
        }
    }
}
